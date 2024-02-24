class Solution{
    public int maxSum(int n) { 
        int ans[] = new int[n+1];
        for(int i = 1 ; i <= n ; i++)
        ans[i] = Math.max(i , ans[i/2]+ans[i/3]+ans[i/4]);
        return ans[n];
    }
}
