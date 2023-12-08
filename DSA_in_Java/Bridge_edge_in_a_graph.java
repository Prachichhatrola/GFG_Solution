class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
        int[]parent=new int[adj.size()];
        Arrays.fill(parent,-1);
        boolean[]visited=new boolean[adj.size()];
        int[]disc=new int[adj.size()];
        int[]low=new int[adj.size()];
        for(int i=0;i<adj.size();i++){
            if(!visited[i]){
                if(DFS(adj,i,visited,parent,disc,low,c,d)){
                    return 1;
                }
            }
        }
        return 0;
    }
    static int time=0;
    static boolean DFS(ArrayList<ArrayList<Integer>> adj,int source,boolean[]visited,int[]parent,int[]disc,int[]low,int c,int d){
        visited[source]=true;
        ++time;
        disc[source]=time;
        low[source]=time;
        for(int i=0;i<adj.get(source).size();i++){
            int node=adj.get(source).get(i);
            if(!visited[node]){
                parent[node]=source;
                if(DFS(adj,node,visited,parent,disc,low,c,d)){
                    return true;
                }
                low[source]=Math.min(low[source],low[node]);
                if((node==d&&source==c||node==c&&source==d)&&low[node]>disc[source]){
                    return true;
                }
            }
            else if(node!=parent[source]){
                low[source]=Math.min(low[source],disc[node]);
            }
        }
        return false;
    }
}
