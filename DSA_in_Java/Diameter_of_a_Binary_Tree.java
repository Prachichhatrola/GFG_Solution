class Solution {
    int ans= 0  ; 
    int height( Node root){
        if(root == null) return 0;
        
        int lh = height( root.left);
        int rh = height( root.right);
        
        ans =  Math.max ( ans , 1+lh+ rh);
        return 1+ Math.max(lh , rh);
    }
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        int data   = height (root);
        return ans;
    }
}
