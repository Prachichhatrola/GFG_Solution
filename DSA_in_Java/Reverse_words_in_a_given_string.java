class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        String[] words = s.split("\\.");
        
        String output = words[0];
        for (int i = 1; i < words.length; i++) {
            output = words[i] + "." + output;
        }
        
        return output;
    }
}
