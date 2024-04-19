class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        Set <Integer> hm = new HashSet<>();
        
        for(int i=0;i<b.length;i++){
            if(hm.contains(b[i])){
                continue;
            }
            hm.add(b[i]);
        }
        
        for(int i=0;i<a.length;i++){
            if(!hm.contains(a[i])){
                result.add(a[i]);
            }
        }
        return result;
    }
    
}

