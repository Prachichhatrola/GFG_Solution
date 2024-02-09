class Solution {
    // Function to check whether all nodes of a tree have the value 
    // equal to the sum of their child nodes.
    public static int isSumProperty(Node root) {
        return sumCheck(root) ? 1 : 0;
    }

    // Recursive function to check sum property
    private static boolean sumCheck(Node root) {
        if (root == null)
            return true;

        // For leaf nodes
        if (root.left == null && root.right == null)
            return true;

        int leftSum = root.left != null ? root.left.data : 0;
        int rightSum = root.right != null ? root.right.data : 0;

        // Check if sum property holds for current node
        if (root.data != leftSum + rightSum)
            return false;

        // Recur for left and right subtrees
        return sumCheck(root.left) && sumCheck(root.right);
    }
}
