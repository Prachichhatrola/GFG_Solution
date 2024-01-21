class Solution {
    public static int vertexCover(int n, int m, int[][] edges) {
        int all = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i  <= n ; i++)adj.add(new ArrayList<>());
        for(int ed[] : edges){
            adj.get(ed[0]).add(ed[1]);
            adj.get(ed[1]).add(ed[0]);
        }
        int dp[] = new int[(1<<n)<<1];
        Arrays.fill(dp,-1);
        return mini(all,adj,dp);
        
    }
    private static int mini(int mask , ArrayList<ArrayList<Integer>> adj,int dp[]){
        if(dp[mask]!=-1)return dp[mask];
        int ans = (int)1e9;
        boolean add = false;
        for(int i = 1 ; i < adj.size() ; i++){
            if((mask&(1<<i))==0){
                boolean can = true;
                for(int v : adj.get(i)){
                    if((mask&(1<<v))==0){
                        can = false;
                        break;
                    }
                }
                if(!can){
                    add = true;
                    break;
                }
            }
        }
        if(!add){
            return Integer.bitCount(mask);
        }
        for(int i = 1 ; i < adj.size() ; i++){
            if((mask&(1<<i))==0){
                ans = Math.min(ans , mini(mask|((1<<i)) , adj,dp));
            }
        }
        
        return dp[mask]=ans;
    }
}

     
