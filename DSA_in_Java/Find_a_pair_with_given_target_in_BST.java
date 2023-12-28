class Solution {
    public int isPairPresent(Node root, int target) {
        HashSet<Integer> set=new HashSet<>();
        return isPairPresentHelper(root, target, set)?1:0;
    }
    private boolean isPairPresentHelper(Node root, int target, HashSet<Integer> set) {
        if(root==null) return false;
        if(isPairPresentHelper(root.left, target, set)) return true;
        if(set.contains(target-root.data)) return true;
        set.add(root.data);
        return isPairPresentHelper(root.right, target, set);
    }
}
