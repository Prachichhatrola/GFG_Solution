class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==i+1)
            al.add(i+1);
        }
        return al;
    }
}
