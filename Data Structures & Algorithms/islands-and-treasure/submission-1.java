class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0)
                    q.offer(new int[]{i,j});
            }
        }
        int[][]dir={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[]val=q.poll();
            int r=val[0];
            int c=val[1];
            for(int[]d:dir){
                int nr=r+d[0];
                int nc=c+d[1];
                if(nc>=0 &&nr>=0&&nc<col&&nr<row&&grid[nr]       [nc]==2147483647){
                    grid[nr][nc]=1+grid[r][c];
                    q.offer(new int[]{nr,nc});
                }
            }
        }
    }
}
