class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                map.put(mat2[i][j],map.getOrDefault(mat2[i][j],0)+1);
            }
        }
        int count = 0;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                int val = x-mat1[i][j];
                if(map.containsKey(val)){
                    count += map.get(val);
                }
            }
        }
        return count;
    }
}
