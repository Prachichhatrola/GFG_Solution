class Solution {

 

    int[] Series(int n) {

        // code here

        int m[]=new int[n+1];

        int a=0,b=1,c=1;

        int i=0;

        int mod=1000000007;

        while(i<=n){

            m[i++]=a;

            a=b;

            b=c;

            c=(a+b)%mod;

        }

        return m;

    }

}

