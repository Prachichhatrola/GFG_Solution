class Solution
{   
    //Function to return a list of BST elements in a given range.
    public static ArrayList<Integer> printNearNodes(Node root,int low,int high){
        // code here.
        ArrayList<Integer>list=new ArrayList<>();
        Solution s=new Solution();
        s.inorder(root,low,high,list);
        Collections.sort(list);
        return list;
    }
    public void inorder(Node root,int l,int h,ArrayList<Integer>list){
        if(root==null){
            return;
        }
        inorder(root.left,l,h,list);
        if(root.data>=l&&root.data<=h){
            list.add(root.data);
        }
        inorder(root.right,l,h,list);
    }
}
