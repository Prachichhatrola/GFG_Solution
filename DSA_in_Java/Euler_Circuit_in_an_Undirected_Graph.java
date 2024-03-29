class Solution {
    public boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        for(int i=0;i<adj.size();i++){
            if(adj.get(i).size()%2!=0){
                return false;
            }
        }
        return true;
    }
}
