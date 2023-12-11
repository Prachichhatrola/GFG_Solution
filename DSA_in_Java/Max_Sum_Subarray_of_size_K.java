class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr,int N){
        // code here
        long max=0,sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=Arr.get(i);
        }
         max=Math.max(max,sum);
        for(int i=k;i<N;i++)
        {
            sum=sum-Arr.get(i-k);
            sum+=Arr.get(i);
            max=Math.max(max,sum);
            
        }
        return max;
        
    }
}
