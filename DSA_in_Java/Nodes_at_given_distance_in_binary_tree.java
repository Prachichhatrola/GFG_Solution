class Solution
{
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int p)
    {
     
     
     HashSet<Node> s=new HashSet<>();
     Queue<Node> q=new LinkedList<>();
     HashMap<Node,Node> par=new HashMap<>();
     trav(root,par);
     Node t=find(root,target);
     //System.out.println(t.data);
     q.add(t);
     q.add(null);
    // System.out.println(par);
     int count=0;
      s.add(t);
     while(!q.isEmpty()){
         Node k=q.poll();
        
         if(k==null){
             if(q.isEmpty()){
                 count++;
                 break;
             }else{
                 count++;
                 if(count==p){
                     break;
                 }
                 q.add(null);
             }
         }else{
                      
         if(k.left!=null&&!s.contains(k.left)){
             q.add(k.left);
              s.add(k.left);
             
         }
          if(k.right!=null&&!s.contains(k.right)){
             q.add(k.right);
              s.add(k.right);

         }
             if(par.containsKey(k)&&!s.contains(par.get(k))){
                  s.add(par.get(k));
             q.add(par.get(k));}
             
         }
         
     }
     ArrayList<Integer> ans=new ArrayList<>();
     while(!q.isEmpty()){
         Node f=q.poll();
         if(f!=null){
             ans.add(f.data);
         }
     }
     Collections.sort(ans);
     return ans;
     
    }
    public static Node find(Node root,int target){
        if(root==null){
            return null;
        }
        if(root.data==target){
        return root;}
        Node left=find(root.left,target);
        Node right=find(root.right,target);
        if(left==null){
            return right;
        }else{
            return left;
        }
        
        
    }
    public static void trav(Node r,HashMap<Node,Node> h){
      Queue<Node> q=new LinkedList<>();
      q.add(r);
      while(!q.isEmpty()){
          Node k=q.poll();
          if(k.left!=null){
              h.put(k.left,k);
              q.add(k.left);
          }
          if(k.right!=null){
              h.put(k.right,k);
              q.add(k.right);
          }
          
          
      }
        
    }
};
