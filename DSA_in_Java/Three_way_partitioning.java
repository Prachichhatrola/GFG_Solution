class Solution {
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
    public void threeWayPartition(int nums[], int lb, int ub) {
        int low = 0, mid = 0, high = nums.length - 1;
        
        while (mid <= high) {
            
            if (nums[mid] < lb) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] > ub) {
                swap(nums, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }
}
