class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        // Your code goes here.
        
        Queue<Node> q=new LinkedList();
        
        q.offer(root);
    
        
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                Node temp=q.poll();
                
                
                 if(!q.isEmpty()&&(i+1!=size)){
                    temp.nextRight=q.peek();
                }
                
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                
               
            }
        }
    }
}
