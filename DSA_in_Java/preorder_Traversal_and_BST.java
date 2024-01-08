class Solution {
    
    static int canRepresentBST(int arr[], int N) {
        Stack<Integer> stack=new Stack<>();
        int root=Integer.MIN_VALUE;
        for(int i=0; i<N; i++) {
            if(arr[i]<root) return 0;
            while(!stack.isEmpty() && arr[i]>stack.peek()) {
                root=stack.pop();
            }
            stack.push(arr[i]);
        }
        return 1;
    }
}
