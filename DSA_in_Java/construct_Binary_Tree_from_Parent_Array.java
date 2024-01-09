class Solution
{
    //Function to construct binary tree from parent array.
    public static Node createTree(int parent[], int N){
        HashMap<Integer,Node> h=new HashMap<Integer,Node>();
        Node head=null;
        for(int i=0;i<N;i++){
            if(parent[i]==-1){
                if(h.containsKey(i)){
                    head=h.get(i);
                }
                else{
                    head=new Node(i);
                    h.put(i,head);
                }
            }
            else{
                Node a=null;
                if(h.containsKey(i)){
                    a=h.get(i);
                }
                else{
                    a=new Node(i);
                    h.put(i,a);
                }
                Node b=null;
                if(h.containsKey(parent[i])){
                    b=h.get(parent[i]);
                }
                else{
                    b=new Node(parent[i]);
                    h.put(parent[i],b);
                }
                if(b.left==null){
                    b.left=a;
                }
                else if(b.right==null){
                    b.right=a;
                }
            }
        }
        return head;
    }
    
}
