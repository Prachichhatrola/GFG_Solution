class Solution{
    public ArrayList <Integer> verticalSum(Node root) {
        if(root == null) return new ArrayList<Integer>();
        
        // ArrayList<Integer> al = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        
        verticalSum(root, 0, map);
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int key : map.keySet()){
            ans.add(map.get(key));
        }
        
        return ans;
        
        
    }
    
    public void verticalSum(Node root, int d, Map<Integer, Integer> map){
        if(root == null) return;
        
        verticalSum(root.left,d-1,map);
        
        int s = (map.get(d) == null) ? 0 : map.get(d);
        map.put(d, s+root.data);
        
        verticalSum(root.right,d+1,map);
    }
    
}
