class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int sourcer = -1;
        int sourcec = -1;
        int destr = -1;
        int destc = -1;

       // find the indices to source and destination.
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    sourcer = i;
                    sourcec = j;
                }
                if(grid[i][j] == 2){
                    destr = i;
                    destc = j;
                }
            }
        }

       //Dfs from source to destination.
        return isPos(grid, sourcer, sourcec, destr, destc, n);
        
        
    }
    
    static boolean isPos(int[][] grid, int sourcer, int sourcec, int destr, int destc, int n){

        // basic Boundary conditions (Visited cell is marked as "4")
        if(sourcec < 0 || sourcec >= n || sourcer < 0 || sourcer >= n || grid[sourcer][sourcec] == 0 || grid[sourcer][sourcec] == 4){
            return false;
        }

       // check if we are at the destination.
        if(grid[sourcer][sourcec] == 2){
            return true;
        }
        // Mark the visited cell as 4 to avoid overlapping
        grid[sourcer][sourcec] = 4;
        /* Check if destination can be reached by going Left OR Right OR Up OR Down (in all directions) (dfs) */
        return isPos(grid, sourcer-1, sourcec, destr, destc, n) || isPos(grid, sourcer, sourcec-1, destr, destc, n) || isPos(grid, sourcer+1, sourcec, destr, destc, n) || isPos(grid, sourcer, sourcec+1, destr, destc, n);
        
    }
}
