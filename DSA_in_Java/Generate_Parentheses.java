class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> list = new ArrayList<>();
        String s = "";
        gp(n,0,0,s,list);
        return list;
    }
    
    public static void gp(int n, int left, int right, String s, List<String> list){
        if(s.length()==2*n){
            list.add(s);
            return;
        }
        if(left<n) gp(n,left+1,right,s+"(",list);
        if(right<left) gp(n,left,right+1,s+")",list);
    }
}

