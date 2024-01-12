class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    public List<Integer> merge(Node root1,Node root2)
    {
        // Write your code here
        List<Integer> t1=new ArrayList<>();
        inorder(root1,t1);
        inorder(root2,t1);
        Collections.sort(t1);
        return t1;
    }
    public static void inorder(Node r,List<Integer> l){
        if(r==null) return;
        inorder(r.left,l);
        l.add(r.data);
        inorder(r.right,l);
        return;
    }
 }
