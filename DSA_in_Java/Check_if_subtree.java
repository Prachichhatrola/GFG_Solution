class Solution {
    public static boolean isSubtree(Node T, Node S) {
       return helper(T,S,false);
    }
    
    public static boolean helper(Node T,Node S, boolean situation){
         // add code here.
        if(T==null&&S==null )
        return true;
        
        if(T==null || S==null)
        {
            return false;
            
        }
        
        if(T.data==S.data){
            if(!(helper(T.left,S.left,true)&&helper(T.right,S.right,true))){
                return helper(T.left,S,false)||helper(T.right,S,false);
            }
            else{
                return true;
            }
        }
        else{
            if(situation){
               return  false;
            }
            else{
                return helper(T.left,S,false)||helper(T.right,S,false);
            }
        }
            
    }
}
