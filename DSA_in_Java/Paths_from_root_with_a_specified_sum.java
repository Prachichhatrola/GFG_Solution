class Solution
{
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        helper(root,sum,list,new ArrayList<Integer>());
        return list;
    }
    public static void helper(Node root, int sum,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> rahee)
    {
        if(root == null)
        return;
        rahee.add(root.data);
        
        int rem = sum - root.data;
        if(rem == 0) list.add(new ArrayList<>(rahee));
        
        helper(root.left,rem,list,rahee);
        helper(root.right,rem,list,rahee);
        
        rahee.remove(rahee.size() - 1);
    }
}
