class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        Queue<Node> q=new LinkedList<Node>();
        
        q.offer(node);
        
        
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                Node temp=q.poll();
                
                if(ans.isEmpty()){
                    ans.add(temp.data);
                }
                else{
                    ans.add(i,temp.data);
                }
                
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
        }
        
        return ans;
    }
}      
