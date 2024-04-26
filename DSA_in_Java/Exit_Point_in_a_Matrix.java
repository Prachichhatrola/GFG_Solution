class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        // code here\
        int ans[] ={0,0};
        return forward(0,0,n, m, matrix, ans);
    }
    public int[] forward(int i, int j, int n, int m, int arr[][], int ans[]){
        for(int a=j; a<m; a++){
            if(arr[i][a]==1){
                arr[i][a] = 0;
                down(i+1,a,n,m,arr,ans);
                return ans;
            }
        }
        ans[0] = i;
        ans[1] = m-1;
        return ans;
    }
    public int[] down(int i, int j, int n, int m, int arr[][], int ans[]){
        for(int a=i; a<n; a++){
            if(arr[a][j]==1){
                arr[a][j] = 0;
                backward(a,j-1,n,m,arr,ans);
                return ans;
            }
        }
        ans[0] = n-1;
        ans[1] = j;
        return ans;
    }
    public int[] backward(int i, int j, int n, int m, int arr[][], int ans[]){
        for(int a=j; a>=0; a--){
            if(arr[i][a]==1){
                arr[i][a] = 0;
                up(i-1,a,n,m,arr,ans);
                return ans;
            }
        }
        ans[0] = i;
        ans[1] = 0;
        return ans;
    }
    public int[] up(int i, int j, int n, int m, int arr[][], int ans[]){
        for(int a=i; a>=0; a--){
            if(arr[a][j]==1){
                arr[a][j] = 0;
                forward(a,j+1,n,m,arr,ans);
                return ans;
            }
        }
        ans[0] = 0;
        ans[1] = j;
        return ans;
    }
}
