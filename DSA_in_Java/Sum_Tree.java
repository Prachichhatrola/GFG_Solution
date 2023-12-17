class Solution
{
    boolean isSumTree(Node root)
    {
        // Your code here
        int ans = tree(root);
        return ans != -1;
    }

    public int tree(Node root)
    {
        if (root == null)
            return 0; // Return 0 for empty subtree

        if (root.left == null && root.right == null) // Leaf
            return root.data;

        int l = tree(root.left);
        int r = tree(root.right);

        if (l == -1 || r == -1 || (l + r) != root.data)
            return -1;

        return root.data + l + r;
    }
}


