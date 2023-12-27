class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        // Code here
        int n = matrix.length;
        int ans[] = new int[n*n];
        ans[0] = matrix[0][0];
        int ind = 1;
        
        for(int j=1; j<n; j++){
            int x = 0; int y = j;
            while(x <= j && y >= 0){
                ans[ind] = matrix[x][y];
                ind++; y--; x++;
            }
        }
        
        for(int i=1; i<n; i++){
            int x = i; int y = n-1;
            while(x < n){
                ans[ind] = matrix[x][y];
                ind++; x++; y--;
            }
        }
        
        return ans;

    }
}
