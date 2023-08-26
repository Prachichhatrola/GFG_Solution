class Solution {
    int binarysearch(int arr[], int n, int k) {
      
     
        int mid,low,high;
     
        low=0;
        high=n-1;
        while(low<=high)
        {
        mid=(low+high)/2;
        if(arr[mid]==k)
        {
            return mid;
        }
        if(arr[mid]>k)
        {
            high=mid-1;
            
        }
        if(arr[mid]<k)
        {
            low=mid+1;
          
        }
        
        } 
        return -1;
    }
    
}
