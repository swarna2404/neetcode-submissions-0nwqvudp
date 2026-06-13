class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        int time=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1)fresh++;
                else if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        if(fresh==0)return 0;
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        while(!q.isEmpty()){
            boolean rotten=false;
            int size=q.size();
            for(int i=0;i<size;i++){
                int [] val=q.poll();
                int r=val[0];
                int c=val[1];
                for(int j=0;j<4;j++){
                    int nr=r+dr[j];
                    int nc=c+dc[j];
                    if(nr>=0&&nc>=0 && nr<row &&nc<col&& grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        fresh--;
                        q.offer(new int[]{nr,nc});
                        rotten=true;
                    }
                }
            }if(rotten)time++;
        }
        if(fresh==0)return time;
        else return -1;
        
    }
}
