class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
        if(m==n) return -1; 
        int xor=m^n;// after finding xor first set bit from right is pos 
        int f=(xor)&(-xor);
        int pos=(int)(Math.log(f)/Math.log(2));
        
        return pos+1;
            
    }
}
