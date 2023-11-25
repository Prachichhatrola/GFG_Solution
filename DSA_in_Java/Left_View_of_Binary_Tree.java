class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> l=new ArrayList<>();
      int level=1;
       view(root,l,level);
       return l;
    }
    int maxlevel=0;
    void view(Node root,ArrayList<Integer> l,int level){
        if(root==null){
            return;
        }
        if(maxlevel<level){
            l.add(root.data);
            maxlevel=level;
        }
        view(root.left,l,level+1);
        view(root.right,l,level+1);
    }
}
