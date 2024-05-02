class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
      ArrayList<Integer> A = new ArrayList<>();

    public ArrayList<Integer> serialize(Node root) {
        // Clear the list before serializing
        A.clear();
        serializeHelper(root);
        return A;
    }

    private void serializeHelper(Node root) {
        if (root == null) {
            A.add(-1);
            return;
        }
        A.add(root.data);
        serializeHelper(root.left);
        serializeHelper(root.right);
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A) {
        // code here
           if(A.size()==0)
        return null;
        int a=A.remove(0);
        if(a==-1)
        return null;
        Node root=new Node(a);
        root.left=deSerialize(A);
        root.right=deSerialize(A);
        return root;
    }
};

