class Solution {
    int getMaxWidth(Node root) {
       int ans = Integer.MIN_VALUE;
       int size = 0;
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       q.add(null);
       while(!q.isEmpty()){
           Node curr = q.remove();
           if(curr == null){
               ans = Math.max(ans,size);
               size = 0;
               if(q.isEmpty()){
                   break;
               }else{
                   q.add(null);
               }
           }else{
               size++;
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
