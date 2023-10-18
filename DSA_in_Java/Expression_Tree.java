class Solution {
    public int evalTree(Node root) {
        // Your code here.
        int sum=0;
        if(root==null)
        {
            return -1;
        }
        else if(root.left==null && root.right==null)
        {
            return Integer.parseInt(root.data);
        }
        else{
       int a=(evalTree(root.left));
       int b=(evalTree(root.right));
        if(root.data.equals("+"))
        {
            sum=a+b;
        }
        else if(root.data.equals("*"))
        {
            sum=a*b;
        }
        else if(root.data.equals("/"))
        {
            sum=a/b;
        }
        else 
        {
            sum=a-b;
        }
        
        return sum;
        }
        
    }
}
