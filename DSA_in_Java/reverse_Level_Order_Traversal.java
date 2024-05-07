class Tree
{
    List<List<Integer>> list;
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        list = new ArrayList<>();
        traverse(node, 1);
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=list.size()-1; i>=0; i--){
            for(int num : list.get(i)){
                res.add(num);
            }
        }
        return res;
    }
    
    private void traverse(Node node, int level){
        if(node == null) return;
        if(list.size() <= level){
            list.add(new ArrayList<>());
        }
        list.get(level-1).add(node.data);
        traverse(node.left, level+1);
        traverse(node.right, level+1);
    }
}      
