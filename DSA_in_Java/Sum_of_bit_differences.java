class Solution {
    long sumBitDifferences(int[] arr, int n) {
        long ans = 0; // Initialize the result

        // Traverse over all bits
        for (int i = 0; i < 32; i++) {

            // Count number of elements with i'th bit set
            int count = 0;

            for (int j = 0; j < n; j++)
                if ((arr[j] & (1 << i)) != 0)
                    count++;

            // Add "count * (n - count) * 2" to the answer
            ans += (long) count * (n - count) * 2;
        }

        return ans;
    }
}
