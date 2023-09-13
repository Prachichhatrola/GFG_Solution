class Solution
{
    public int[] common_digits(int[] nums) {
        
        int [] freq = new int[10];
        
        for(int i : nums){
            int x = i;
            while(x > 0){
                int r = x % 10;
                freq[r]++;
                x /= 10;
            }
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i<10;i++){
            if(freq[i] > 0){
                al.add(i);
            }
        }
        
        int [] ans = new int[al.size()];
        
        for(int i = 0;i<ans.length;i++){
            ans [i] = al.get(i);
        }
        
        return ans;
    }
}
