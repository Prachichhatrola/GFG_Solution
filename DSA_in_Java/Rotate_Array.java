class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
   static void rotateArr(int arr[], int d, int n)
    {   int r = d;
        while(r>n){
            r = r-n;
        }
        int[] a = arr.clone();
        for(int i = 0;i<n-r;i++){
            arr[i] = arr[i+r];
        }
        for(int i = 0;i<r;i++){
            arr[n-r+i] = a[i];
        }
    }
}
