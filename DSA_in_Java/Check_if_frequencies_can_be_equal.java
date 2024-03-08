class Solution {
    boolean sameFreq(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int n = s.length();
        
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        
        int sz = mp.size();
        int avg = (int)(n / sz);
        
        if(n - (sz * avg) > 1) // we need at most one character to delete
            return false;
            
        for(HashMap.Entry<Character, Integer>m: mp.entrySet())
            if(m.getValue() < avg)
                return false;
                
        return true;
    }
}
