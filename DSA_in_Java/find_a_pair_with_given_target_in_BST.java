class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
    public int isPairPresent(Node root, int target)
    {
        // Write your code here
        HashSet<Integer> l=new HashSet<>();
        inorder(root,l);
     for(Integer i:l){
         if(l.contains(target-i)){
             return 1;
         }
     }
     return 0;
    }
    public void inorder(Node root,HashSet<Integer> l){
        if(root==null){
            return;
        }
        inorder(root.left,l);
        l.add(root.data);
        inorder(root.right,l);
    }
}

