class Solution
{
    boolean contains(Node root , int p){
        if(root == null)return false;
        if(root.data == p)return true;
        return contains(root.left,p) || contains(root.right,p);
    }
    //Function to return the lowest common ancestor in a Binary Tree.
    Node lca(Node root, int n1,int n2)
    {
        // Your code here
        if(n1 == n2)return new Node(n1);
        if(n1 == root.data || n2 == root.data)return root;
        boolean leftn1 = contains(root.left,n1);
        boolean rightn2 = contains(root.right,n2);
        if(leftn1 && rightn2)return root;
        if(!leftn1 && rightn2)return lca(root.right,n1,n2);
        if(leftn1 && !rightn2)return lca(root.left,n1,n2);
        return root;
    }
}


