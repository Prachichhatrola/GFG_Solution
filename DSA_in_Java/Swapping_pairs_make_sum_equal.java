class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        // Your code goes here
        long suma = 0;
        for (long num : a) {
            suma += num;
        }
        
        long sumb = 0;
        for (long num : b) {
            sumb += num;
        }
        
        long diff = suma - sumb;
        if (diff % 2 != 0) {
            return -1;
        }
        diff /= 2;

        HashSet<Long> set = new HashSet<>();
        for (long num : a) {
            set.add(num);
        }
        
        for (long num : b) {
            if (set.contains(num + diff)) {
                return 1;
            }
        }
        return -1;
    }
}
