class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int sum=0;
        int start=0;
        int max=Integer.MIN_VALUE;
        int ansStart=start;
        int ansEnd=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
                sum=0;
            if(sum==0)  start=i;
            sum+=a[i];
            if(sum==max)
            {
                int prevMax=ansEnd-ansStart;
                int now=i-start;
                if(now>prevMax)
                {
                    ansStart=start;
                    ansEnd=i;
                }
            }
            if(sum>max)
            {
                max=Math.max(max, sum);
                ansStart=start;
                ansEnd=i;
            } 
            if(sum<0)
                sum=0;
        }
        
        for(int  i=ansStart;i<=ansEnd;i++)
            ans.add(a[i]);
        if(ans.isEmpty())
            ans.add(-1);        
        return ans;
    }
}
