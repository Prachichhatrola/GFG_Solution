class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
       
        int st = 0, end = n-1;
        int diff = 0;
        while(st<=end){
            if(a[st]<=a[end]){
                diff = Math.max(diff,end-st);
                st++;
                end=n-1;
            }else{
                end--;
            }
        }
        return diff;
    }
}
