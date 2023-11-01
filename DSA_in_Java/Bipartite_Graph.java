class Solution
{
     public boolean isBipartite(int n, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int[] color = new int[n];
      
        for(int i=0; i<n; i++){
            if(color[i] == 0){
             boolean isBipartite = isBipartiteBfs(i, adj, color);  
             if(isBipartite == false){
                 return isBipartite;
             }
            }
        }
        return true;
    }
   

    public boolean isBipartiteDfs(int node, ArrayList<ArrayList<Integer>>adj, 
    int[] color, int col){
        
        color[node] = col;
        boolean isBipartite = true;
        
        for(int u : adj.get(node)){
            if(color[u] == 0){
                
                if(col==1){
                 isBipartite = isBipartiteDfs(u, adj, color, 2); 
                }else{
                 isBipartite = isBipartiteDfs(u, adj, color, 1); 
                }
                
                 if(isBipartite == false){
                     return false;
                 }
            }
            else if(color[u] == col){
             return false;   
            }
        }
    
        return isBipartite; 
    }

   


    public boolean isBipartiteBfs(int node, ArrayList<ArrayList<Integer>>adj, 
    int[] color){
        
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        color[node] = 1;
        int col = 2;
        
        while(!queue.isEmpty()){
            node = queue.poll();
            if(color[node] == 1){
                col = 2;
            }else{
                col = 1;
            }
            
            for(int u : adj.get(node)){
                if(color[u] == 0){
                    queue.add(u);
                    color[u] = col;
                }
                else if(color[u] != col){
                    return false;
                }
            }
            
        }
        
        return true; 
    }


}
