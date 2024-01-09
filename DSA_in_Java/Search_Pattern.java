class Solution
{
    ArrayList<Integer> search(String pat, String txt)
    {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        
        while(true){
            int idx = txt.indexOf(pat, i);
            if(idx==-1){
                break;
            }else{
                al.add(idx+1);
                i=idx+1;
            }
        }
        
        if(al.size()==0)al.add(-1);
        return al;
    }
}
