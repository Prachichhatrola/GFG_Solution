class Solution {
    String binaryNextNumber(String s) {
        int n = s.length(), zero = 0;
        StringBuilder str = new StringBuilder(s);
        
        for(int i = n - 1; i >= 0; i--) {
            if(str.charAt(i) == '0') {
                str.setCharAt(i, '1');
                zero = 1;
                break;
            } else
                str.setCharAt(i, '0');
        }
        
        if(zero == 0)
            str.insert(0, '1');
            
        int i = 0;
        while(i < str.length() && str.charAt(i) == '0')
            i++;
        
        return str.substring(i).toString();
    }
}
