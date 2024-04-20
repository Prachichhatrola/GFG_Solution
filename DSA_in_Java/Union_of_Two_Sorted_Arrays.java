class Solution {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                ans.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                ans.add(arr2[j]);
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        } 
        
        while (i < n) {
            ans.add(arr1[i]);
            i++;
        }
        
        while (j < m) {
            ans.add(arr2[j]);
            j++;
        }
        
        TreeSet<Integer> set = new TreeSet<>(ans);
        ans.clear();
        ans.addAll(set);
        
        return ans;
    }
}
