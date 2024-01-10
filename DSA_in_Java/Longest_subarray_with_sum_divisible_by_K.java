class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
        Map<Integer, Integer> remMap = new HashMap<>();
        remMap.put(0, -1); 
        int currSum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            currSum += a[i];
            int rem = currSum % k;

            if (rem < 0) {
                rem += k;  
            }

            if (remMap.containsKey(rem)) {
                maxLen = Math.max(maxLen, i - remMap.get(rem));
            }

            if (!remMap.containsKey(rem)) {
                remMap.put(rem, i);
            }
        }

        return maxLen;
    }
 
}
