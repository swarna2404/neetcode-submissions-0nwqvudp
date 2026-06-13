class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        Queue <int[]> q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        int []dr={1,-1,0,0};
        int[]dc={0,0,1,-1};
        while(!q.isEmpty()){
            int[]cur=q.poll();
            int nr=cur[0];
            int nc=cur[1];
            for(int i=0;i<4;i++){
                int r=nr+dr[i];
                int c=nc+dc[i];
                if(r>=0 && c>=0 && r<row && c<col && grid[r][c]==2147483647){
                    grid[r][c]=grid[nr][nc]+1;
                    q.offer(new int[]{r,c});
                }
            }
        }
        System.out.print(grid);
    }
}
