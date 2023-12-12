class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        int ans = 0;
        for(int j = 1; j < m; j += 1) {
            for(int i = 0; i < n; i += 1) {
                int a = 0;
                if(i - 1 >= 0) {
                    a = M[i-1][j-1];
                }
                
                int b = M[i][j-1];
                
                int c = 0;
                if(i + 1 < n) {
                    c = M[i+1][j-1];
                }
                M[i][j] += Math.max(a, Math.max(b, c));
                if(M[i][j] > ans) {
                    ans = M[i][j];
                }
            }
        }
        return ans;
    }
}
