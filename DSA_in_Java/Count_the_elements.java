class Solution {
    public static int upperBound(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return low;
    }
    
    public static int[] countElements(int a[], int b[], int n, int queries[], int q) {
        Arrays.sort(b);
        int[] res = new int[q];
        
        for (int j = 0; j < q; j++) {
            int target = a[queries[j]];
            res[j] = upperBound(b, target);
        }
        
        return res;
    }
}
