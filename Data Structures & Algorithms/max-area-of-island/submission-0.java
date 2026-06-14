class Solution {
    public int dfs(boolean[][]visited,int[][]grid,int r,int c){
        int row=grid.length;
        int col=grid[0].length;
        if(r<0||r>=row||c>=col||c<0||visited[r][c]|| grid[r][c] == 0)return 0;
        visited[r][c]=true;
        return 1+dfs(visited,grid,r-1,c)+
        dfs(visited,grid,r+1,c)+
        dfs(visited,grid,r,c+1)+
        dfs(visited,grid,r,c-1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        boolean[][] visited=new boolean[row][col];
        int max=0;
        int area;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    area=dfs(visited,grid,i,j);
                    if(area>max){
                        max=area;
                    }
                }
            }
        }
        return max;
        
    }
}
