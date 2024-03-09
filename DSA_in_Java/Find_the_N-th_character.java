class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        while(r-- > 0) 
        {
            String temp = "";
            for(int i = 0; i <= n; i++) 
            {
                if(s.charAt(i) == '1')
                    temp += "10";
                else
                    temp += "01";
            }
            
            s = temp;
        }
        
        return s.charAt(n);
    }
}
