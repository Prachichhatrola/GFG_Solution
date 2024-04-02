class Solution
{
    
    int absolute_diff(Node root)
    {
        int prev[] = {-1};
        int min[] = {Integer.MAX_VALUE};
        inorder(root,prev,min);
        return min[0];
    }
    static void inorder(Node root,int prev[],int min[]){
        if(root==null) return;
        inorder(root.left,prev,min);
        if(prev[0]!=-1){
            min[0] = Math.min(min[0],Math.abs(prev[0]-root.data));
        }
        prev[0] = root.data;
        inorder(root.right,prev,min);//Your code here
    }
}
