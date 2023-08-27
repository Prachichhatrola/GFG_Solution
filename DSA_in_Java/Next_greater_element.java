class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
         long next[] = new long[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                next[i] = -1;
            }
            else{
                next[i] = arr[s.peek()];
               
            }
             s.push(i);
        }
       return next;
    } 
}
