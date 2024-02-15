class Solution
{
    public int isPossible(int[][] paths)
    {
        // Code here
         for(int i=0;i<paths.length;i++)
        {
            int count = 0;
            for(int j=0;j<paths.length;j++)
            {
                if(paths[i][j]==1)
                    count++;
            }
            if(count%2==1) 
                return 0;
        }
        return 1;
    }
}

