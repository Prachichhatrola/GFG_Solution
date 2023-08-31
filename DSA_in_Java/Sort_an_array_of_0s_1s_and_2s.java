class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int x : a){
            if(x == 0) cnt0++;
            else if (x == 1) cnt1++;
            else cnt2++;
        }
        
        
        for(int j=0; j<cnt0; j++){
            a[j] = 0;
        }
        for(int j=cnt0; j<cnt1+cnt0; j++){
            a[j] = 1;
        }
        for(int j=cnt0+cnt1; j<cnt0+cnt1+cnt2; j++){
            a[j] = 2;
        }
    }
}
