class Solution {
    public int numIslands(char[][] grid) {
        Queue<int[]>q=new LinkedList<>();
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        boolean[][]visited=new boolean[row][col];
        int[][]dir={{-1,0},{1,0},{0,-1},{0,1}};
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'&&!visited[i][j]){
                    count++;
                    visited[i][j]=true;
                    q.offer(new int[]{i,j});
                    while(!q.isEmpty()){
                        int[]val=q.poll();
                        int r=val[0];
                        int c=val[1];
                        for(int[]d:dir){
                            int nr=r+d[0];
                            int nc=c+d[1];
                            if(nr<row && nc<col &&nr>=0 && nc>=0&&!visited[nr][nc] && grid[nr][nc] == '1'){
                                visited[nr][nc]=true;
                                q.offer(new int[]{nr,nc});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
    
}
