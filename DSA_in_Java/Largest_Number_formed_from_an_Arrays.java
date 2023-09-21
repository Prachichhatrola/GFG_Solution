class Solution {
    String printLargest(String[] nums) {
        Arrays.sort(nums, (a,b) -> (b+a).compareTo(a+b));
        return nums[0].equals("0")?"0":String.join("", nums);
}
}
