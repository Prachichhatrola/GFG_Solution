class Solution{
    String reverseWords(String S){
        // your code here
        StringBuilder p = new StringBuilder();
        Stack<Character> s1 = new Stack<>();
        for(int i = 0; i <= S.length() - 1; i++){
            char c = S.charAt(i);
            s1.push(c);
        }
         while(!s1.isEmpty()){
            p.append(s1.pop());
         }
         S = p.toString();
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        Stack<String> s = new Stack<>();
        for(int i = 0; i <= S.length() - 1;i++){
            char c = S.charAt(i);
            if(c == '.'){
                s.push(ans.toString());
                s.push(".");
                ans.setLength(0);
            }else{
                ans.append(c);
            }
        }
        s.push(ans.toString());
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }
}
