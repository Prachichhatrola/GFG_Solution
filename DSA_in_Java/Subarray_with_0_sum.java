class Solution{
    
    public static boolean Ans(int []arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum ==0)return true;
        return false;
    }
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        for(int size = 1;size<=n;size++){
            for(int i = 0;i<=n-size;i++){
                int []arr1 = new int[size];
                int k= 0;
                
                for(int j=i;j<i+size;j++){
                    arr1[k++] = arr[j] ;
                    
                }
                if(Ans(arr1) == true)return true;
            }
        }
        return false;
    }
}
