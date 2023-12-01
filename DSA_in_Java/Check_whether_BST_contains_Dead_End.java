class Solution
{
    public static boolean isDeadEnd(Node root)
    {
        // HashSet<Integer> allNodes = new HashSet<>();
        // HashSet<Integer> leafNodes = new HashSet<>();
        
        // allNodes.add(0);
        
        // storeNodes(root, allNodes, leafNodes);
        
        // for(int i : leafNodes){
        //     int x = i;
        //     if(allNodes.contains(x+1) && allNodes.contains(x-1)){
        //         return true;
        //     }
        // }
        // return false;
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        findAllNodes(root, map);
        return check(root, map);
    }
    // public static void storeNodes(Node root, HashSet<Integer> allNodes, HashSet<Integer> leafNodes){
    //     if(root == null){
    //         return;
    //     }
    //     allNodes.add(root.data);
        
    //     if(root.left == null && root.right == null){
    //         leafNodes.add(root.data);
    //         return;
    //     }
    //     storeNodes(root.left, allNodes, leafNodes);
    //     storeNodes(root.right, allNodes, leafNodes);
    // }
    
    public static void findAllNodes(Node root, Map<Integer, Integer> map){
        if(root == null)return;
        
        map.put(root.data, 1);
        findAllNodes(root.left, map);
        findAllNodes(root.right, map);
    }
    public static boolean check(Node root, Map<Integer, Integer> map){
        if(root == null)return false;
        
        if(root.left == null && root.right == null){
            int pre = root.data-1;
            int nex = root.data+1;
            
            if(map.containsKey(pre) && map.containsKey(nex)){
                return true;
            }
        }
        return check(root.left, map) || check(root.right, map);
    }
}



