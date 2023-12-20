class Solution{
    static int findWinner(int n, int A[]){
        // code here
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= A[i];
        }

        if (xor == 0) {
            return 1; // Player 1 wins
        } else {
             if(n%2==0){
                 return 1;
             }else{
                 return 2;
             }
        }
    }
}
