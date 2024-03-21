class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
    ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Integer> temp=new ArrayList<>();
    int i=0;
    Queue<Node> queue=new LinkedList<>();
    ArrayList<Integer> zigZagTraversal(Node root)
    {
        //Add your code here.
        queue.offer(root);
        queue.offer(new Node(-100));
        while(!queue.isEmpty()){
            Node node=queue.poll();
            if(node.data==-100){
                if(!queue.isEmpty()){
                    queue.offer(new Node(-100));
                }
                
                i++;
                if(!temp.isEmpty()){
                    for(int i=temp.size()-1;i>=0;i--){
                        list.add(temp.get(i));
                    }
                    temp.clear();
                }
            }
            if(i%2==0){
                if(node.data!=-100){
                    
                list.add(node.data);
                }
            }else{
                if(node.data!=-100){
                    
                temp.add(node.data);
                }
            }
           
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                
                queue.offer(node.right);
            }
        }
        
        return list;
        
        
    }
}
