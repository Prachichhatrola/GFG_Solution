class Solution
{
    void left_traversal(Node root,ArrayList<Integer> list) {
		if(root.left == null && root.right == null)return;
		if(root.left != null) {
			list.add(root.data);
			left_traversal(root.left,list);
		}else if(root.right != null) {
			list.add(root.data);
			left_traversal(root.right,list);
		}
	}

	void leaf_traversal(Node root,ArrayList<Integer> list) {
		if(root.left == null && root.right == null) {
			list.add(root.data);
			return;
		}
		if(root.left != null)leaf_traversal(root.left,list);
		if(root.right != null)leaf_traversal(root.right,list);
	}
	
	void right_traversal(Node root,ArrayList<Integer> list) {
		if(root.left == null && root.right == null)return;
		if(root.right != null)right_traversal(root.right,list);
		else if(root.left != null) right_traversal(root.left,list);
		list.add(root.data);
	}
	ArrayList <Integer> boundary(Node root)
	{
	    ArrayList<Integer> list = new ArrayList<>();
	    if(root.left == null && root.right == null){
	        list.add(root.data);
	        return list;
	    }
	    if(root.left != null)left_traversal(root,list);
	    else list.add(root.data);
	    leaf_traversal(root,list);
	    if(root.right != null)right_traversal(root.right,list);
	    return list;
	}
}
