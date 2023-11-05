class Solution
{
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        
        int knightx=KnightPos[0];
        int knighty=KnightPos[1];
        int minSteps=Integer.MAX_VALUE;
        
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{knightx,knighty,0});
        
        int visited[][]=new int[N+1][N+1];
        visited[knightx][knighty]=1;
        
        
        int dir[][]={{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2}};
        
        while(q.size()>0)
        {
            int node[]=q.remove();
            int a=node[0];
            int b=node[1];
            int pos=node[2];
            
            if(a==TargetPos[0]&&b==TargetPos[1])
            {
                minSteps=Math.min(minSteps,pos);
                continue;
            }
            for(int i=0;i<dir.length;i++)
            {
                int x=a+dir[i][0];
                int y=b+dir[i][1];
                
                if(x>=1&&y>=1&&x<=N&&y<=N&&visited[x][y]==0)
                {
                    visited[x][y]=1;
                    q.add(new int[]{x,y,pos+1});
                }
            }
        }
        return minSteps==Integer.MAX_VALUE?-1:minSteps;
        
    }
}
