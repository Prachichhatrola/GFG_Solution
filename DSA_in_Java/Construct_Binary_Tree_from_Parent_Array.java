class Solution
{
    //Function to construct binary tree from parent array.
   public static Node createTree(int arr[], int N)
    {
        //Your code here
        Map<Integer,Node> map = new HashMap<>();
        Node root = null;
        
        for(int i = 0; i < N; i++){
            if(arr[i] == -1){
                root = new Node(i);
                map.put(i,root);
            } else {
                Node temp = new Node(i);
                map.put(i,temp);
            }
        }
        
        for(int i = 0; i < N; i++){
            
            if(arr[i] == -1){
                continue;
            } else {
                Node temp = map.get(arr[i]);
                if(temp.left == null){
                    temp.left = map.get(i);
                } else {
                    temp.right = map.get(i);
                }
            }
        }
        
        return root;
    } 


    
}

