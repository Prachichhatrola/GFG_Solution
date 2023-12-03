
class Solution
{
	public static int countPairs(Node root1, Node root2, int x)
	{
	    int c=0;
		HashSet<Integer> set1=new HashSet<>();
		add(set1,root1);
		HashSet<Integer> set2=new HashSet<>();
		add(set2,root2);
		for(int i:set2){
		    if(set1.contains(x-i))
		    c++;
		}
		return c;
        		
	}
	public static void add(HashSet<Integer> set,Node root){
	    if(root==null)
	    return;
	    
	    set.add(root.data);
	    add(set,root.left);
	    add(set,root.right);
	}
}
