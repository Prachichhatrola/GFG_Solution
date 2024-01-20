class Solution
{
    public static int distributeCandy(Node root)
    {
        return traverse(root)[2];
    }
    
    public static int[] traverse(Node node) {
        if (node == null) return new int[]{0, 0, 0};
        int[] left = traverse(node.left);
        int[] right = traverse(node.right);
        int nodes = left[0] + right[0] + 1;
        int candies = left[1] + right[1] + node.data;
        int moves = left[2] + right[2] + Math.abs(left[1]-left[0]) + Math.abs(right[1]-right[0]);
        return new int[]{nodes, candies, moves};
    }
}
