class Solution {
    public void dfs(int[][]heights,int r,int c,boolean[][]vis){
        vis[r][c]=true;
        int[]dr={1,-1,0,0};
        int[]dc={0,0,1,-1};
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr<0||nc<0||nr>=heights.length||nc>=heights[0].length)
            continue;
            if(vis[nr][nc])continue;
            if(heights[nr][nc]<heights[r][c])continue;
            dfs(heights,nr,nc,vis);
        }
        
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row=heights.length;
        int col=heights[0].length;
        boolean[][]atlantic=new boolean[row][col];
        boolean[][]pacific=new boolean[row][col];
        //pacific
        for(int i=0;i<col;i++){
            dfs(heights,0,i,pacific);
        }
        for(int i=0;i<row;i++){
            dfs(heights,i,0,pacific);
        }
        //atlantic
        for(int i=0;i<col;i++){
            dfs(heights,row-1,i,atlantic);
        }
        for(int i=0;i<row;i++){
            dfs(heights,i,col-1,atlantic);
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(atlantic[i][j]&&pacific[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;

    }
}
