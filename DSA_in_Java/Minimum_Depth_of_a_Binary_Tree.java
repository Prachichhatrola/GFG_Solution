class Solution{
    int ans = Integer.MAX_VALUE;
    void Level(Node root,int mylevel){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            ans = Math.min(ans,mylevel);
        }
        Level(root.left,mylevel+1);
        Level(root.right,mylevel+1);
        
    }
    int minDepth(Node root){
       Level(root,1);
       if(ans == Integer.MAX_VALUE){
           return 0;
       }
       return ans;
    }
}


