class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int n=nums.length;
        if(n%2!=0)return false;
        int[]r=new int[k];
        for(int i=0;i<n;i++){
            r[nums[i]%k]++;
        }
        if(r[0]%2!=0)return false;
        int i=1;
        int j=k-1;
        while(i<=j){
            if(i==j){
                if(r[i]%2!=0)return false;
            }else{
                if(r[i]!=r[j])return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
