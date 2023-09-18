class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        int ans = 0;
        for(int i = 0; i < N; i++){
            ans = ans ^ A[i];
        }
        return ans;
    }
}
