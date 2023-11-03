public static Node post_order(int pre[], int size) 
{
    //Your code here
    Node root=null;
    for(int p:pre)
    {
        root=bst(root, p);
    }
    return root;
  
} 
public static Node bst(Node root,int val)
{
    if(root==null)
    {
        root=new Node(val);
        return root;
    }
    if(root.data>val)
    {
        root.left=bst(root.left,val);
    }
    else
    {
        root.right=bst(root.right,val);
    }
    
    return root;
}
