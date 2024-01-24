class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
         if (n - 1 != m) {
            // A tree with n nodes will have n-1 edges
            return false;
        }

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        // Check for connectivity and cycles using DFS
        if (!dfs(adjList, 0, -1, visited)) {
            return false;
        }

        // Check if all nodes are visited
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(ArrayList<ArrayList<Integer>> adjList, int node, int parent, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                if (!dfs(adjList, neighbor, node, visited)) {
                    return false;
                }
            } else if (neighbor != parent) {
                // If the neighbor is visited and not the parent, there is a cycle
                return false;
            }
        }

        return true;
    }
}
