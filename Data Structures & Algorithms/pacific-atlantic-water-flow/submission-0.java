class Solution {

    public void dfs(int r, int c, int[][] heights, boolean[][] vis) {
        int row = heights.length;
        int col = heights[0].length;

        vis[r][c] = true;

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr < 0 || nc < 0 || nr >= row || nc >= col)
                continue;

            if (vis[nr][nc])
                continue;

            if (heights[nr][nc] < heights[r][c])
                continue;

            dfs(nr, nc, heights, vis);
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row = heights.length;
        int col = heights[0].length;

        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];

        // Pacific: top row and left column
        for (int j = 0; j < col; j++) {
            dfs(0, j, heights, pacific);
        }

        for (int i = 0; i < row; i++) {
            dfs(i, 0, heights, pacific);
        }

        // Atlantic: bottom row and right column
        for (int j = 0; j < col; j++) {
            dfs(row - 1, j, heights, atlantic);
        }

        for (int i = 0; i < row; i++) {
            dfs(i, col - 1, heights, atlantic);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }
}