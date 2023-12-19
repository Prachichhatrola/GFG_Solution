class Solution {
    Node Mirror(Node root){
        if(root == null){
            return root;
        }
        Node left = Mirror(root.left);
        Node right = Mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    void mirror(Node root) {
        // Your code here
        Mirror(root);
    }
}
