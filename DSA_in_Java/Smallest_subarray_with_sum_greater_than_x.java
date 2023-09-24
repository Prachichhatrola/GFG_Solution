class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
        int start=0;
        int sum=0;
        int count=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            sum+=a[i];
            while(sum>x &&start<=i){
                count=Math.min(count,i-start+1);
                sum-=a[start++];
            }
        }
        if(count==Integer.MAX_VALUE) count=0;
        return count;
    }
}
