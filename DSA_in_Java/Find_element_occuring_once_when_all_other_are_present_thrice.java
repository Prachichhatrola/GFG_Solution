class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        int result=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])==false)
            map.put(arr[i],1);
            else{
                int x = map.get(arr[i]);
                x+=1;
                if(x==3)
                map.remove(arr[i]);
                else
                map.put(arr[i],x);
            }
        }
        for(Map.Entry<Integer,Integer> data: map.entrySet()){
            result = data.getKey();
        }
        return result;
    }
} 
