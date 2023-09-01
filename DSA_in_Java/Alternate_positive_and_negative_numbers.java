class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                neg.add(arr[i]);
            }
            else {
                pos.add(arr[i]);
            }
        }
        
        int i = 0, j = 0, k = 0;
        while(i < pos.size() && j < neg.size()) {
            arr[k++] = pos.get(i);
            arr[k++] = neg.get(j);
            i++;
            j++;
        }
        
        while(i < pos.size()) {
            arr[k++] = pos.get(i);
            i++;
        }
        
        while(j < neg.size()) {
            arr[k++] = neg.get(j);
            j++;
        }
    }
}
