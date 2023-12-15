class Solution
{
 public int nthPoint(int n)
    {
        // Code here
        if(n == 1 || n == 2) return n;
        
        int dp[] = new int[n+1];
        
        int mod = (int)Math.pow(10,9) + 7;
        
        dp[0] = 1; dp[1] = 1; dp[2] = 2;
        
        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-1]%mod) + (dp[i-2]%mod);
        }
        
        return dp[n]%mod;
    }}
