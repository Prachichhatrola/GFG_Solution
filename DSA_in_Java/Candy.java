class Solution {
    static int minCandy(int N, int ratings[]) {
        
        int candy[] = new int[N];
        Arrays.fill(candy , 1);
        
        //left to right
        for(int i = 1 ; i < N ; i++){
            if(ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1] + 1;
            }
        }
        
        //right to left
        for(int i = N-2 ; i >= 0 ; i--){
            if(ratings[i] > ratings[i+1]){
                candy[i] = Math.max(candy[i+1] + 1 , candy[i]);
            }
        }
        int count = 0;
        for(int i = 0 ; i < N ; i++){
            count += candy[i];
        }
        return count;
    }
}
