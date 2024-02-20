class Solution {
    public static int wordBreak(String A, ArrayList<String> B) {
        int n = A.length();
        HashSet<String> wordSet = new HashSet<>(B);
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(A.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n] ? 1 : 0;
    }
    public static void main(String[] args) {
        ArrayList<String> B1 = new ArrayList<>(List.of("i","like","sam","sung","samsung","mobile"));
        String A1 = "ilike";
        System.out.println(wordBreak(A1, B1));
        ArrayList<String> B2 = new ArrayList<>(List.of("i","like","sam","sung","samsung","mobile"));
        String A2 = "ilikesamsung";
        System.out.println(wordBreak(A2, B2));
    }
}
