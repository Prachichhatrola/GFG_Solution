class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
       
        boolean vis[]  = new boolean[V];
         vis[0] = true;
        while(!q.isEmpty())
        {
            int cur = q.remove();
            
                list.add(cur);
               
                for(int i : adj.get(cur))
                {
                    if (!vis[i]) {
                    q.add(i); // Add unvisited adjacent nodes to the queue for further exploration.
                    vis[i] = true; // Mark them as visited.
                }
            }
        }
        
        return list;
        
    }
}
