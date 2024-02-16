class Solution {

    public Node flattenBST(Node root) {
        // Code here
        if (root == null) {
            return null;
        }
        List<Node> nodes=new ArrayList<>();
        inOrderTraversal(root, nodes);
        for(int i=0;i<nodes.size()-1;i++)
        {
            nodes.get(i).left=null;
            nodes.get(i).right=nodes.get(i+1);
        }
         nodes.get(nodes.size() - 1).left = null;
        nodes.get(nodes.size() - 1).right = null;
        return nodes.get(0);
    }
    public static void inOrderTraversal(Node node, List<Node> nodes)
        {
            if(node==null)
            {
                return;
            }
            inOrderTraversal(node.left, nodes);
            nodes.add(node);
            inOrderTraversal(node.right, nodes);
        }
}
