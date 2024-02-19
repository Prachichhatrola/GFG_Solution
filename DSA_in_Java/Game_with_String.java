class Solution{
    static int minValue(String s, int k){
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(Character ch : map.keySet())pq.add(map.get(ch));
        int i =0;
        while(!pq.isEmpty() && i < k){
            int val = pq.remove();
            val -= 1;
            if(val > 0)pq.add(val);
            i++;
        }
        int sum =0;
        while(!pq.isEmpty()){
            sum += Math.pow(pq.remove(),2);
        }
        return sum;
    }
}
