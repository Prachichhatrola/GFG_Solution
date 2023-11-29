class Solution{
    int maxlevel = 0;
    void RightView(Node root,ArrayList<Integer> ans,int level){
        if(root == null){
            return;
        }
        if(maxlevel < level){
            ans.add(root.data);
            maxlevel = level;
        }
        RightView(root.right,ans,level+1);
        RightView(root.left,ans,level+1);
    }
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        RightView(root,ans,1);
        return ans;
    }
}
