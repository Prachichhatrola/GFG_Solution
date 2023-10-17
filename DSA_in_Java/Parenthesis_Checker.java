class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character>s=new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if( ch=='{' || ch=='(' || ch=='['){
                s.push(ch);
            }
            else if((!s.isEmpty()) && (s.peek()=='{' && ch=='}' ||
                    s.peek()=='(' && ch==')' ||
                    s.peek()=='[' && ch==']')){
                        s.pop();
            }
            else{
                return false;
            }
        }
        return s.isEmpty();
    }
}
