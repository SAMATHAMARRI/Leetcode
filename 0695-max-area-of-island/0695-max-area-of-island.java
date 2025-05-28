class Solution {
    static int count=0;
    public int maxAreaOfIsland(int[][] a) 
    {
   int r=a.length,c=a[0].length,mx=0;
        int sr=-1,sc=-1;
        int vis[][]=new int[r][c];
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==1)
                {
                    count=0;
                    bfs(a,i,j,r,c,vis);
                   mx=Math.max(mx,count);
                }
            }
        }
       return mx;
    }
    public static int bfs(int a[][],int sr,int sc,int r,int c,int vis[][])
    {   if(sr < 0 || sr>=r || sc<0 || sc>=c || a[sr][sc]==0||vis[sr][sc]==1)
          return 0;
          
        vis[sr][sc]=1;
        if(a[sr][sc]==1)
        {
        count = 1 + bfs(a,sr - 1, sc,r,c,vis) +
         bfs(a, sr, sc + 1,r,c,vis) + 
         bfs(a, sr + 1, sc,r,c,vis) +
          bfs(a, sr, sc - 1,r,c,vis);
        }
        return count;
    }
}