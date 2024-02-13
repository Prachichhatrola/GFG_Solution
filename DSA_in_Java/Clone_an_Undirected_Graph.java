class Solution{ 
    
    Node cloneGraph(Node node){
       if(node == null){ 
           return null;
       }   
       
       Queue<Node> q = new LinkedList<>(); 
       q.add(node); 
       // create map to keep track of all the node which are already copied 
       HashMap<Node,Node> map = new HashMap<>();  
       // the node into hashmap with copt node; 
       
       map.put(node, new Node(node.val)); 
       while(!q.isEmpty()){ 
           // remove fist node of q 
           Node fn = q.poll();  
           // take coped node from the map
           Node cpn = map.get(fn); 
           if(fn.neighbors != null)
           { 
               ArrayList<Node> clist = fn.neighbors; 
               // treak each node of list 
               // we node is node copied than we will simply get null 
               for( int i=0; i<clist.size(); i++){ 
                   Node ln  = clist.get(i); 
                   // try to get coped node of ln 
                   // if it node copy than we will get null 
                   Node cl = map.get(ln); 
                   if(cl == null){ 
                       q.add(ln); 
                       cl = new Node(ln.val); 
                       map.put(ln ,cl);
                   }  
                   // add the neighbotr of cpd node;
                   cpn.neighbors.add(cl);
                  
               }
           }
           
       } 
       return map.get(node);
    }
}
