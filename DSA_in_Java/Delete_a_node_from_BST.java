class Tree {
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int X) {
        // code here.
        if(root==null) return root;
        
        if(root.data>X) root.left = deleteNode(root.left, X);
        else if(root.data<X) root.right = deleteNode(root.right,X);
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            
            root.data=minValue(root.right, root.data);
            root.right=deleteNode(root.right, root.data);
        }
        
        return root;
    }
    
    public static  int minValue(Node root, int x){
    
        int min = root.data;
        while(root!=null){
            min = root.data;
            root = root.left;
        }
        
        return min;
    }
}
