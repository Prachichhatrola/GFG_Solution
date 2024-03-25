class Solution {
    ArrayList<String> NBitBinary(int N) {
        // code here
        ArrayList<String> a = new ArrayList<>();
        String s="";
        int cnt=0;
        int one=0;
        sol(N,cnt,a,s,one);
        Collections.sort(a,Collections.reverseOrder());
        return a;
    }
    
    void sol(int n, int cnt, ArrayList<String> a,String s,int one)
    {
        if(n<=0)
        {
            a.add(s);
            return;
        }
        if(cnt<one)
        {
            sol(n-1,cnt+1,a,s+'0',one);
            sol(n-1,cnt,a,s+'1',one+1);
        }
        else
        sol(n-1,cnt,a,s+'1',one+1);
    }
}
