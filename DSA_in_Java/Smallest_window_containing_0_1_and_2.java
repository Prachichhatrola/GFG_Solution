class Solution {
    public int smallestSubstring(String S) {
        int z = 0,o = 0,t = 0,i = 0,j = 0,n = S.length(),min = Integer.MAX_VALUE;
        while(i<n){
            char c = S.charAt(i);
            if(c=='0') z++;
            else if(c=='1') o++;
            else t++;
                
            while(check(z,o,t) && j<i){
                min = Math.min(min,i-j+1);
                char a = S.charAt(j);
                if(a=='0') z--;
                else if(a=='1') o--;
                else t--;
                j++;
            }
            i++;
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    static boolean check(int z,int o,int t){
        return z!=0 && o!=0 && t!=0;
    }
}
