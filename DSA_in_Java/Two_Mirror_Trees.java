class Solution {
    boolean areMirror(Node a, Node b) {
        if(a == null && b == null){
            return true;
        }else if(a == null || b == null || a.data != b.data){
            return false;
        }
        if(!areMirror(a.left,b.right)){
            return false;
        }
       if(!areMirror(a.right,b.left)){
            return false;
       }
       return true;
    }
}
