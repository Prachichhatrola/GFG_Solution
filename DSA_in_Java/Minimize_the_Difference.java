class Solution {
    public static int minimizeDifference(int n, int k, int[] arr) {
        int post_max[] = new int[n];
        int post_min[] = new int[n];
        
        post_max[n - 1] = post_min[n - 1] = arr[n - 1];
        
        for(int i = n - 2; i >= 0; i--) {
            post_max[i] = Math.max(arr[i], post_max[i + 1]);
            post_min[i] = Math.min(arr[i], post_min[i + 1]);
        }
        
        int mini = arr[0], maxi = arr[0], res = post_max[k] - post_min[k];
        
        for(int i = 1; i < n - k; i++) {
            res = Math.min(res, Math.max(maxi, post_max[i + k]) - Math.min(mini, post_min[i + k]));
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }
        
        res = Math.min(res, maxi - mini);
        
        return res;
    }
}
