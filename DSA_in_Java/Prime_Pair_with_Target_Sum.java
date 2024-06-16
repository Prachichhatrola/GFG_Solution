class Solution {
    
    public static boolean findPrimeNumber(int n)
    {
        if (n <= 1) return false; 
        if (n <= 3) return true; 
    
        if (n % 2 == 0 || n % 3 == 0) return false;
    
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
    
        return true;
    }
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        
        int  temp =n;
        int i =2,j =n-2;
        ArrayList<Integer> ans = new ArrayList<>();
        while( i<=j)
        {
            if(findPrimeNumber(i) && findPrimeNumber(j) && (j+i==n))
            {
                ans.add(i);
                ans.add(j);
                return ans;
            }
            i++;
            j--;
        }
        ans.add(-1);
        ans.add(-1);
        return ans;
    }
}
