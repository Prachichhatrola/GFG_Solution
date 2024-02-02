class Solution
{
    int atoi(String s) {


        int num = 0;
        int sign = 1;
        int i = 0;

        // to keep the sign of the number
        if(s.charAt(0) == '-') {
            sign = -1;
            i = 1;
        }
    
        for(; i < s.length(); i++) {
            if(s.charAt(i) < '0' || s.charAt(i) > '9') return -1;
            
            num = num * 10 + (s.charAt(i) - '0');
        }
        
        return num * sign;
    }
}
