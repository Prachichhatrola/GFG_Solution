class Solution {
    static boolean isFeasible(int[] arr, int N, int K, int mid) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > mid) { // If any element is greater than mid, it's not feasible
                return false;
            }
            if (sum + arr[i] > mid) {
                count++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        
        return count <= K; // Check if the count of subarrays is less than or equal to K
    }
    static int splitArray(int[] arr, int N, int K) {
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < N; i++) {
            end += arr[i]; // Sum of the whole array is the upper bound
        }
        
        int result = Integer.MAX_VALUE;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (isFeasible(arr, N, K, mid)) {
                result = Math.min(result, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return result;
    }
}
