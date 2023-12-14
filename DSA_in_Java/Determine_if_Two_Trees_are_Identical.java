class Solution
{

	boolean isIdentical(Node root1, Node root2)
	{

	    return check(root1,root2);
	}
	public static boolean check(Node root1,Node root2){
	    if(root1==null || root2==null){
	        return root1==root2;
	    }
	    if(root1.data != root2.data){
	        return false;
	    }
	    
	    return check(root1.left,root2.left) && check(root1.right,root2.right);
	    
	}
	
}
