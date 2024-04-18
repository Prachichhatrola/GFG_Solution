class Solution
{
    public int[] twoRepeated(int arr[], int n)
    {
        int[] ans = new int[2];
        Set<Integer> set = new HashSet<>();
        int j = 0;
        for (int i : arr){
            if (set.contains(i)) ans[j++] = i;
            set.add(i);
            if (j == 2) break;
        }
        return ans;
    }
    
}
