class Solution {
    private static class Tuple implements Comparable<Tuple>{
        int num;
        int fre;
        Tuple(int num , int fre){
            this.num = num;
            this.fre = fre;
        }
        public int compareTo(Tuple t){
            if(t.fre == this.fre){
                return t.num - this.num;
            }
            return this.fre - t.fre;
        }
    }
    public static ArrayList<Integer> kTop(int[] a , int n , int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        PriorityQueue<Tuple> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                if(!map.containsKey(a[j])){
                    map.put(a[j] , 0);
                }
                map.put(a[j] , map.get(a[j])+1);
            }
            for(Map.Entry<Integer , Integer> m : map.entrySet()){
                pq.add(new Tuple(m.getKey() , m.getValue()));
            }
            while(!pq.isEmpty() && ans.size() < k){
                if(pq.peek().num == 0){
                    break;
                }
                ans.add(pq.poll().num);
            }
            
            if(i != n-1){
                IntArray.print(ans);
                map.clear();
                pq.clear();
                ans.clear();
            }
                
        }
        return ans;
    }
}
