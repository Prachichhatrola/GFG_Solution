class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
       
        ArrayList<Integer>list=new ArrayList<>();
         if(n==0){
            list.add(-1);
            return list;
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>1)
            list.add(key);
        }
        if(list.size()==0)
        list.add(-1);
        Collections.sort(list);
        return list;
}
}
