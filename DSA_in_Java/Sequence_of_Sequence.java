class Solution{
    static int numberSequence(int m, int n)
    {
        // code here
        if(n==0)
        return 0;
        
        if(n==1)
        return m;
        
        int sum=0;
        
        for(int i=1;i<=m;i++){
            
            sum+=numberSequence(i/2,n-1);
        }
        
        return sum;
    }
}
