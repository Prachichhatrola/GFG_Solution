class Solution {
    // Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr, int n) {
        // Initialize variables for the cumulative sum and count.
        long cumulativeSum = 0;
        long count = 0;
        
        // Create a HashMap to store cumulative sums and their frequencies.
        HashMap<Long, Integer> sumFreqMap = new HashMap<>();
        
        // Initialize the sumFreqMap with an entry for sum=0 to handle subarrays
        // that start from the beginning of the array.
        sumFreqMap.put(0L, 1); // 0L is used to indicate a long value of 0.

        // Iterate through the array and calculate the cumulative sum.
        for (int i = 0; i < n; i++) {
            cumulativeSum += arr[i];
            
            // If the cumulative sum was seen before, increment the count.
            if (sumFreqMap.containsKey(cumulativeSum)) {
                count += sumFreqMap.get(cumulativeSum);
            }
            
            // Add the current cumulative sum to the map with its frequency.
            sumFreqMap.put(cumulativeSum, sumFreqMap.getOrDefault(cumulativeSum, 0) + 1);
        }
        
        // Return the final count of subarrays with sum equal to 0.
        return count;
    }
}
