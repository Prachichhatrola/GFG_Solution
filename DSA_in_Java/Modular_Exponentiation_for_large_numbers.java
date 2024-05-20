class Solution
{
    public long PowMod(long x, long n, long m)
    {
        // Code here
        if(x%m==0)return 0;
        if(n==0)return 1;
        if(n==1)return x%m;
        if(n%2==0)return PowMod((x*x)%m,n/2,m)%m;
        return (x*PowMod(x,n-1,m))%m;
    }
}
