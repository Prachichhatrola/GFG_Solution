class Solution
{
    int kSubstrConcat(int n, String s, int k)
    {
        int ans = 0;
        if(n%k!=0) return ans;
        HashSet<String> subs = new HashSet<>();
        for(int i=0;i<n;i=i+k) subs.add(s.substring(i,i+k));
        if(subs.size() <= 2) ans=1 ;    
        return ans;
    }
}
