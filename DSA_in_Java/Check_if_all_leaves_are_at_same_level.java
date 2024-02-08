class Solution
{
    boolean check(Node root)
    {
        boolean[] right = new boolean[1];
        right[0] = false;
        boolean[] ans = new boolean[1];
        ans[0] = true;
        int[] path = new int[1];
        helper(root,path,0,right,ans);
        return ans[0];
    }
    static void helper(Node root,int[] path, int count, boolean[] right, boolean[] ans)
    {
        if(root.right == null && root.left == null)
        {
            if(right[0])
            {
                if(path[0] != count)
                {
                    ans[0] = false;
                }
            }
            else {
                path[0] = count;
                right[0] = true;
            }
        }
        if(root.left != null)
        {
            helper(root.left,path,count+1,right,ans);
        }
        if(root.right != null)
        {
            helper(root.right,path,count+1,right,ans);
        }
    }
}
