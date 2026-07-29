class Solution {
    public void dfs(boolean[][] visited,char[][]grid,int row,int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length)
        return;
        if((grid[row][col]=='0')||(visited[row][col]))return;
        visited[row][col]=true;
        dfs(visited,grid,row-1,col);
        dfs(visited,grid,row+1,col);
        dfs(visited,grid,row,col-1);
        dfs(visited,grid,row,col+1);
    }
    public int numIslands(char[][] grid) {
        int count=0;
        int row=grid.length;
        int col=grid[0].length;
        boolean visited[][]=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'&& !visited[i][j]){
                    count++;
                    dfs(visited,grid,i,j);
                }
            }
        }
        return count;
    }
}
