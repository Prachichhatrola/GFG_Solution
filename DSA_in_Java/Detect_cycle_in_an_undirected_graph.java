class Solution {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i] && hasCycle(i, -1, visited, adj)) {
                return true;
            }
        }
        return false;
    }
    private boolean hasCycle(int current, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[current] = true;
        for (int neighbor : adj.get(current)) {
            if (!visited[neighbor]) {
                if (hasCycle(neighbor, current, visited, adj)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }
}
