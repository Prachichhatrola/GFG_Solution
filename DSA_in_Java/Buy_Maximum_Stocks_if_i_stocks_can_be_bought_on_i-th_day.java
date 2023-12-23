class Solution {
    
    static class pair{
        int day;
        int stock;
        
        pair(int day,int stock){
            this.day = day;
            this.stock = stock;
        }
        
        
    }
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        ArrayList<pair> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            pair p = new pair(i+1,price[i]);
            list.add(p);
        }
        list.sort((a,b) -> Integer.compare(b.stock,a.stock));
     
        int count = 0;
        for(int i=n-1;i>=0;i--)
        {
            int d= list.get(i).day;
            int s = list.get(i).stock;
            int j=0;
            while(k>0 && j<d)
            {
                int temp = k;
                temp = temp-(list.get(i).stock);
                if(temp >=0)
                {k= temp;
                j++;
                count++;
                }
                else break;
            }
        }
        return count;
   }

}  
