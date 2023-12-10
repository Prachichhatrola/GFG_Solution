class Solution {
    int Sum(ArrayList<Integer> l){
        int sum = 0;
        for(Integer k : l){
            sum += k;
        }
        return sum;
    }
    void Path(Node root,ArrayList<Integer> l,ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        l.add(root.data);
        if(root.left == null && root.right == null){
            int sum = Sum(l);
            ans.add(sum);
        }
        Path(root.left,l,ans);
        Path(root.right,l,ans);
        l.remove(l.size()-1);
        
    }
    boolean hasPathSum(Node root, int S) {
        // Your code here
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Path(root,l,ans);
        if(ans.contains(S)){
            return true;
        }
        return false;
    }
}
