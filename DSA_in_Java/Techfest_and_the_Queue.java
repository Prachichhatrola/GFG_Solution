class Solution {
    public static long sumOfPowers(long a, long b) {
        // code here
        HashMap<Long,Long> m= new HashMap<>();//for storing all prime factors 
        long sum=0;
        for(long i=a;i<=b;i++){
            long n=i;
            while(n%2==0){
                m.put(2L,m.getOrDefault(2L,0L)+1);
                n=n/2;
            }
        for(long j=3;j*j<=n;j=j+2){
            while(n%j==0){
                m.put(j,m.getOrDefault(j,0L)+1);
                n=n/j;
            }
          
            
        }
        if(n>2){
            m.put(n,m.getOrDefault(n,0L)+1);
        }
        }
        for(Map.Entry<Long,Long> i:m.entrySet()){
            
            sum+=i.getValue();
            
            
        }
        return sum;
        
       
    }
}

     
