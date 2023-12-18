class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
        HashMap<Integer,Stack<Integer>> map = new HashMap<>();
        
        for(int i=0; i<2*e; i+=2) {
            if(!map.containsKey(A[i])) {
               map.put(A[i], new Stack<>());
            }
            map.get(A[i]).push(A[i+1]);
        }
        
        for(int i=0; i<2*e; i+=2) {
            if (map.get(B[i]).peek() != B[i+1]) return 0;
            map.get(B[i]).pop();
        }
        
        return 1;
    }
};
