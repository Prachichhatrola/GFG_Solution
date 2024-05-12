class Solution {
    static int solve(int d, int i, int j) {
        if(i >= d && (i - d) % 2 == 0)
            return j;
        
        j++;
        return solve(d, i + j, j);
    }

    static int minSteps(int d) {
        return solve(d, 0, 0);
    }
}
