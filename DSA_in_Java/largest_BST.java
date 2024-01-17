class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
     static int largestBst(Node root)
    {
       trav(root);
       int k=max;
       max=0;
        return k;
        
    }
    static int max=0;
    static void trav(Node r){
        if(r==null){
            return;
        }
        ArrayList<Integer> a=new ArrayList<>();
        inor(r,a);
        if(issorted(a)){
            max=Math.max(max,a.size());
        }
        trav(r.left);
        trav(r.right);
    }
    static boolean issorted(ArrayList<Integer> a){
        if(a.size()==1){
            return true;
        }
        for(int i=1;i<a.size();i++){
            if(a.get(i)<=a.get(i-1)){
                return false;
            }
        }
        return true;
    }
    
    
    static void inor(Node r,ArrayList<Integer> a){
        if(r==null){
            return;
        }
        inor(r.left,a);
      
        a.add(r.data);
        inor(r.right,a);
    }
    
}
