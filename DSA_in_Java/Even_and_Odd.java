class Solution {
    static void reArrange(int[] arr, int N) {
        int [] array = new int[N];
        int indexEven = 0;
        int indexOdd = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                array[indexEven] = arr[i];
                indexEven +=2;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                array[indexOdd] = arr[i];
                indexOdd +=2;
            }
        }
        for(int i=0;i<array.length;i++){
            arr[i] = array[i];
        }
    }
};
