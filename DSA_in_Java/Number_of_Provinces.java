class DisjointSet{
    int n;
    int[] rank;
    int[] parent;
    
    public DisjointSet(int n){
        this.n = n;
        rank = new int[n];
        parent = new int[n];
        
        for(int i = 0;i<n;i++){
            parent[i] = i;
        }
    }
    public int find(int node){
        if(node == parent[node]){
            return node;   
        }
        return parent[node] = find(parent[node]);
    }
    public void unionByRank(int u,int v){
        int upu = find(u);
        int upv = find(v);
        
        if(rank[upu]<rank[upv]){
            parent[upu] = upu;
        }
        else if(rank[upu]>rank[upv]){
            parent[upv] = upu;
        }
        else{
            parent[upu] = upv;
            rank[upv]++;
        }
    }
    
}

class Solution {

    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        DisjointSet dsu = new DisjointSet(V);
        
        for(int i = 0;i<V;i++){
            for(int j = 0;j<V;j++){
                if(adj.get(i).get(j) == 1){
                    dsu.unionByRank(i,j);
                }
            }
        }
        int cnt = 0;
        for(int i = 0;i<V;i++){
            if(dsu.parent[i] == i){
                cnt++;
            }
        }
        return cnt;
    }
}
