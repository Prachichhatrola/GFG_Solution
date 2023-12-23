class Pair{
    int size,min,max;
    
    Pair(int size,int min,int max){
        this.size=size;
        this.min=min;
        this.max=max;
    }
    
}
class Solution{
    
    static int largestBst(Node root){
        Pair p= largestBstRel(root); 
        return p.size;
    }
    
    static Pair largestBstRel(Node root){
        
        if(root==null) return new Pair(0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        
        Pair p1=largestBstRel(root.left);
        Pair p2=largestBstRel(root.right);
        
        if(p1.max<root.data && p2.min>root.data) 
            return new Pair(1+p1.size+p2.size, Math.min(p1.min,root.data), Math.max(p2.max,root.data));
        else 
            return new Pair(Math.max(p1.size,p2.size), Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
       
}
