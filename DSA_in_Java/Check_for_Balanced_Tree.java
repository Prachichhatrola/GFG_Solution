class Tree{
    int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    boolean isBalanced(Node root){
      if(root == null){
          return true;
      }
      if(Math.abs(height(root.left)-height(root.right)) > 1){
          return false;
      }
      return isBalanced(root.left) && isBalanced(root.right);
    }
}
