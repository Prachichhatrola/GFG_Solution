class Solution 
{
    static Long reversedBits(Long x) 
    {
        if(x==0)
            return 0L;
        StringBuilder binary = new StringBuilder();
        while(x>0)
        {
            long rem=x%2;
            binary.append(rem);  //converting to binary form. but we get reversed form of it.
            x=x/2;  //so we no need to reverse again
        }
        
        while(binary.length()<32)
        {
            binary.append('0');
        }
        
        return binaryToDecimal(binary);
    }
    
    
    public static long binaryToDecimal(StringBuilder binaryNumber) 
    {
    
        long decimal = 0;
        int power = 0;
    
        // Start from the rightmost digit
        for (int i = binaryNumber.length() - 1; i >= 0; i--) 
        {
            // Get the current digit (0 or 1)
            int digit = Character.getNumericValue(binaryNumber.charAt(i));
            
            // Multiply the digit by 2^power and add to decimal
            decimal += digit * Math.pow(2, power);
            
            // Increment the power for the next digit
            power++;
        }
        return decimal;
    }

};
