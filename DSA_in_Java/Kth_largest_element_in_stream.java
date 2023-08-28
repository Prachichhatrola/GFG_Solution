class Solution {
    static int[] kthLargest(int k, int[] arr, int n) {
        // code here
        int res[] = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        
        for(int i=0; i<k-1; i++){
            pq.add(arr[i]);
            res[i] = -1;
        }
        for(int i=k-1; i<n; i++){
            pq.add(arr[i]);
            if(pq.size()>k)
                pq.poll();
            res[i] = pq.peek();
            
        }
        return res;
    }
    
}
