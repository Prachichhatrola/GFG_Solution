class Tree
{
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr.left != null){
                q.add(curr.left);
                if(curr.right == null)
                    res.add(curr.left.data);
            }
            if(curr.right != null){
                q.add(curr.right);
                if(curr.left == null)
                    res.add(curr.right.data);
            }
        }
        if(res.size() == 0){
            res.add(-1);
            return res;
        }
        Collections.sort(res);
        return res;
    }
}
