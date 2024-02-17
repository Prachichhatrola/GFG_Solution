class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        
        for(int i=(int)n-1;i>0;i--){
            int p=(i-1)/2;
            if(arr[i]>arr[p])
                return false;
        }
        
        return true;
    }
}
