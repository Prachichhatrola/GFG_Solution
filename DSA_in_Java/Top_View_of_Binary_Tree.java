class Solution{
    static Map<Integer,int[]> map;
    public static void solve(Node root,int pos,int lvl){
        if(root == null) return;
        if(map.get(pos) == null || map.get(pos)[1]>lvl){
            map.put(pos,new int[]{root.data,lvl});
        }
        solve(root.left,pos-1,lvl+1);
        solve(root.right,pos+1,lvl+1);
    }
    public static ArrayList<Integer> topView(Node root){
         map = new TreeMap<>();
         solve(root,0,0);
         ArrayList<Integer> res = new ArrayList<>();
         for(int key:map.keySet()){
             res.add(map.get(key)[0]);
         }
         return res;
    }
}
