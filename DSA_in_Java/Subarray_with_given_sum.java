class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> idx = new ArrayList<Integer>();
        int start = 0, end = 0, sum = arr[0];
        if(s==0){
            idx.add(-1); // Indicates no subarray found
            return idx;
        }
    
    
        while (end < n) {
            if (sum == s) {
                idx.add(start + 1);
                idx.add(end + 1);
                return idx;
            } 
            // for last index
            else if (sum < s) {
                end++;
                if (end < n) {
                    sum += arr[end];
                }
            } 
            // for start index
            else {
                sum -= arr[start];
                start++;
            }
        }
    
        idx.add(-1); // Indicates no subarray found
        return idx;
    }

}
