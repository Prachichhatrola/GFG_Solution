class Solution{
    
    static long countSubarrays(int a[], int n, int L, int R)  
{ 
        // Complete the function
        int start = -1;
        int end = -1;
        
        long count = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] > R) {
                start = i;
                end = i;
                continue;
            }
            
            if(a[i] >= L) {
                end = i;
            }
            
            count += (end - start);
        }
        
        return count;
}
}
