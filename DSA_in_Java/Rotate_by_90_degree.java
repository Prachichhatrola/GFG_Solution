class Solution
{
    
    static void rotateby90(int matrix[][], int n) 
    { 
        // mirror image upside down
        int r1 = 0, r2 = n - 1;
        while(r1 <= r2){
            for(int col = 0; col < n; col++){
                swap(matrix, r1, col, r2, col);
            }
            
            r1++; r2--;
        }
        
        //swap diagonally
        for(int row =0; row < n; row++){
            for(int col = 0; col < n - row; col++){
                swap(matrix, row, col, n - col - 1, n - row - 1);
            }
        }
    }
    
    static void swap(int matrix[][], int r1, int c1, int r2, int c2){
        int temp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = temp;
    }
}
