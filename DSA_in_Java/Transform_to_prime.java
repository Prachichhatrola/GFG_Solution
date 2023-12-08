class Solution
{
    public int minNumber(int arr[], int N)
    {
        int sum=0;
        int res=0;
        for(int n:arr){
            sum+=n;
        }
        while(!isPrime(sum)){
            sum++;
            res++;
        }
        return res;
    }
    public boolean isPrime(int sum){
        for(int i=2;i*i<=sum;i++){
            if(sum %i==0){
                return false;
            }
        }
        return true;
    }
}
