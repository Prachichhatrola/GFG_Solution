class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[n-1])
            {
                count++;
            }
        }
        return count;
    }
}
