class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        int[] arr = new int[201];
        for(int i = 0; i < n; i++){
            arr[a[i]]++;
            if(arr[a[i]] >= k) return a[i];
        }
        return -1;
    } 
}
 
