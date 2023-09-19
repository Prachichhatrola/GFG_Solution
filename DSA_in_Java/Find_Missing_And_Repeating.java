class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] arr1 = new int[100000];
        int[] arr2 = new int[2];
        
        int a=0;
        for(int i=0;i<n;i++){
            arr1[arr[i]]++;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>1){
                arr2[a++]=i;
            }
        }
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1]>1 && arr[i]-arr[i-1]!=0){
                arr2[a]=arr[i]-1;
                break;
            }else{
                if(arr[0]!=1){
                arr2[a]=1;
                }else{
                    arr2[a]=arr[i]+1;
                }
            }
        }
        return arr2;
        
    }
}
