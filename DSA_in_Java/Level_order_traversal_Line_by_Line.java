class Level_Order_Traverse{
    static ArrayList<ArrayList<Integer>> levelOrder(Node root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
          Node curr = q.remove();
          if(curr == null){
              ans.add(new ArrayList<>(l));
              l.clear();
              if(q.isEmpty()){
                  break;
              }else{
                  q.add(null);
              }
          }else{
              l.add(curr.data);
              if(curr.left != null){
                  q.add(curr.left);
              }
              if(curr.right != null){
                  q.add(curr.right);
              }
          }  
        }
        return ans;
    }
}
