class Solution {
    public int findPeakElement(List<Integer> a) {
        // Code here
        int i=0,r=a.size()-1;
        while(i<r){
            int m=i+(r-i)/2;
            if(a.get(m)>a.get(m+1))r=m;
            else i=m+1;
        }
        return a.get(i);
    }
}
