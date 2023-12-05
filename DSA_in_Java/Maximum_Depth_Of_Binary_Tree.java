class Solution {
  public static int Height(Node root){
      if(root == null){
          return 0;
      }
      int lh = Height(root.left);
      int rh = Height(root.right);
      return Math.max(lh,rh)+1;
  }
  public static int maxDepth(Node root) {
      // code here
      return Height(root);
  }
}
