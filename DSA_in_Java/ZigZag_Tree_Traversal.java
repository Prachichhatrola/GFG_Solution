class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
    ArrayList<Integer> zigZagTraversal(Node root)
    {
        Stack<Node>s1=new Stack<>();
        Stack<Node>s2=new Stack<>();
        ArrayList<Integer>al=new ArrayList<Integer>();
        s1.push(root);
        while(!(s1.empty())||!(s2.empty())){
            while(!s1.empty()){
                Node temp=s1.pop();
                al.add(temp.data);
                if(temp.left!=null){ 
                    s2.push(temp.left);
                }
                if(temp.right!=null){
                    s2.push(temp.right);
                }
            }
            while(!s2.empty()){
                Node temp=s2.pop();
                al.add(temp.data);
                if(temp.right!=null){
                    s1.push(temp.right);
                }
                if(temp.left!=null){
                    s1.push(temp.left);
               }
            }
        }
        return al;
        
    }
} 

 
