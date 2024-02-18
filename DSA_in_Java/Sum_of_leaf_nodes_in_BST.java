class Solution
{
    public static int sumOfLeafNodes(Node root)
    {
        // code here 
        int ans = 0;
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.data;
        else if(root.left == null) ans += sumOfLeafNodes(root.right);
        else if(root.right == null) ans += sumOfLeafNodes(root.left);
        else ans += (sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right));
        return ans;
    }
}
