class Solution {
    int findMaxSum(int arr[], int n) {
        int prev2=0,prev1=arr[0];
        for(int i=1;i<n;i++){
            int ans=Math.max(prev1,prev2+arr[i]);
            prev2=prev1;
            prev1=ans;
        }
        return prev1;
    }
}
