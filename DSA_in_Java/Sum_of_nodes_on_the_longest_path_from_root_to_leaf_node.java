class Solution{
    static class Pair implements Comparable<Pair>{
        int sum;
        int h;
        public Pair(int sum,int h){
            this.sum  = sum;
            this.h = h;
        }
        @Override
        public int compareTo(Pair p2){
            if(this.h == p2.h){
                return p2.sum-this.sum;
            }
            return p2.h-this.h;
        }
    }
    public void Print(Node root,ArrayList<Pair> l,int s,int mylevel){
        if(root == null){
            return;
        }
        s+=root.data;
        if(root.left == null && root.right == null){
            l.add(new Pair(s,mylevel));
        }
        Print(root.left,l,s,mylevel+1);
        Print(root.right,l,s,mylevel+1);
        
    }
    public int sumOfLongRootToLeafPath(Node root){
        //code here
        ArrayList<Pair> l = new ArrayList<>();
        Print(root,l,0,1);
        Collections.sort(l);
        Pair p = l.get(0);
        return p.sum;
    }
}
