class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        
        int ar[] = new int[k];
        
        int m = 0;
        for(int i=n-1;i>=n-k;i--){
            ar[m++]=arr[i];
        }
        return ar;
    }
}
