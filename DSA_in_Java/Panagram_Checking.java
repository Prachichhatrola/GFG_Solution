class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        Set<String>st = new HashSet();
        s=s.toLowerCase();
        for(char ch :s.toCharArray())
        {
            if(ch>='a'&&ch<='z')
            st.add(ch+"");
        }
        
        
        return st.size()==26;
    }
}
