class Solution
{
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        if(root==null)
        return -1;
        
        HashMap<Integer,Node> map=new HashMap();
        
        markParent(map,root);
        
        int check=node;
        
        while(map.get(check)!=null){
            k--;
            
            
            check=map.get(check).data;
            
            
            if(k==0)
            return check;
            
        
        }
        return -1;
        
    }
    
    public void markParent(HashMap<Integer,Node> map, Node node){
        
        Queue<Node> q=new LinkedList<>();
        
        q.offer(node);
        map.put(node.data,null);
        
        while(!q.isEmpty()){
            Node temp=q.poll();
            
           if(temp.left!=null){
               q.offer(temp.left);
               map.put(temp.left.data,temp);
           }
           
           if(temp.right!=null){
                q.offer(temp.right);
               map.put(temp.right.data,temp);
           }
        }
        
    }
}
