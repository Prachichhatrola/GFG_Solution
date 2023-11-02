class BinaryTree
{
    static void helper(ArrayList<Integer> list , Node root){
        if(root == null)return;
        list.add(root.data);
        helper(list,root.left);
        helper(list,root.right);
        return;
    }
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        helper(list,root);
        return list;
    }

}
