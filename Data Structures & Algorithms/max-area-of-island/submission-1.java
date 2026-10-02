class Solution {
    public int dfs(int[][]grid,boolean[][]visited,int i,int j){
        int row=grid.length;
        int col=grid[0].length;
        if(i>=row||i<0||j<0||j>=col||visited[i][j]||grid[i][j]==0)
        return 0;
        visited[i][j]=true;
        return 1+dfs(grid,visited,i-1,j)+dfs(grid,visited,i+1,j)+
        dfs(grid,visited,i,j-1)+dfs(grid,visited,i,j+1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int area,max=0;
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1&&!visited[i][j]){
                    area=dfs(grid,visited,i,j);
                    if(area>max){
                        max=area;
                    }
                }
            }
        }
        return max;
    }
}
