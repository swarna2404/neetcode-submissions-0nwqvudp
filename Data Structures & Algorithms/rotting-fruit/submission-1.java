class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]>q=new LinkedList<>();
        int row=grid.length;
        int col=grid[0].length;
        int time=0,fresh=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1)fresh++;
                if(grid[i][j]==2)q.offer(new int[]{i,j});
            }
        }
        if(fresh==0)return 0;
        int[][]dir={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size=q.size();
            boolean rot=false;
            for(int i=0;i<size;i++)
            {
                int[]val=q.poll();
                int r=val[0];
                int c=val[1];
                for(int[]d:dir){
                    int nr=r+d[0];
                    int nc=c+d[1];
                    if(nr>=0&&nc>=0 && nr<row &&nc<col&& grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        fresh--;
                        q.offer(new int[]{nr,nc});
                        rot=true;
                    }
                }
            }
            if(rot)time++;
        }
        if(fresh==0)return time;
        return -1;
    }
}
