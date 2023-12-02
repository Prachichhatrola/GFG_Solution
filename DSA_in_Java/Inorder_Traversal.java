class Solution {
    
    static void helper(ArrayList<Integer> list , Node root){
        if(root == null)return;
        helper(list,root.left);
        list.add(root.data);
        helper(list,root.right);
        return;
    }
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> list = new ArrayList<>();
        helper(list,root);
        return list;
        
    }
}
