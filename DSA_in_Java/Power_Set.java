class Solution {
    public List<String> AllPossibleStrings(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();

        // i loop for 0 to 2^n-1
        for (int i = 1; i < (1 << n); i++) {
            StringBuilder sub = new StringBuilder();

            // j loop for running in the length of string
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // if bit is set
                    sub.append(s.charAt(j));
                }
            }
            ans.add(sub.toString());
        }

        Collections.sort(ans); // Sort the list before returning it
        return ans;
    }
}
