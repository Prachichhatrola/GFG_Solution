class Solution{
    public static int transform(Node root){
        if(root == null){
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);
        int data = root.data;
        root.data = leftChild+rightChild;
        return data+leftChild+rightChild;
    }
    public void toSumTree(Node root){
         //add code here.
         transform(root);
         return;
    }
}
