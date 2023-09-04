class Solution {
    void segregateEvenOdd(int arr[], int n) {
        Arrays.sort(arr);
        int [] array = new int[n];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                array[index] = arr[i];
                index++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(arr[i]%2!=0){
                array[index] = arr[i];
                index++;
            }
        }
        for(int i=0;i<array.length;i++){
            arr[i] = array[i];
        }
    }
}
