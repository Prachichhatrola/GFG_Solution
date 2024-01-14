class Solution
{
    public void inorder(Node root , Node x , Node[] res){
        if(root == null) return;
        
        if(root.data<=x.data){
            inorder(root.right , x , res);
        }else{
            res[0] = root;
            inorder(root.left , x , res);
        }
    }
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public Node inorderSuccessor(Node root,Node x)
         {
             Node[] res = new Node[1];
             res[0] = null;
             inorder( root , x , res);
             return res[0];
          //add code here.
         }
}

