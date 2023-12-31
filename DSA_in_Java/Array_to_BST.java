class Solution{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public void preorder(Node root,ArrayList<Integer> l){
        if(root == null){
            return;
        }
        l.add(root.data);
        preorder(root.left,l);
        preorder(root.right,l);
        return;
    }
    public Node CreateBst(int nums[],int si, int ei){
        if(si > ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(nums[mid]);
        root.left = CreateBst(nums,si,mid-1);
        root.right = CreateBst(nums,mid+1,ei);
        return root;
        
    }
    public int[] sortedArrayToBST(int[] nums){
        // Code here 
        int arr[] = new int[nums.length];
        ArrayList<Integer> l = new ArrayList<>();
        Node root = CreateBst(nums,0,nums.length-1);
        preorder(root,l);
        for(int i = 0;i <= l.size()-1; i++){
            arr[i] = l.get(i);
        }
        return arr;
    }
}
