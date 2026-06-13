class Solution {
    public void dfs(int nr,int nc,char [][] board){
        int row=board.length;
        int col=board[0].length;
        if(nr<0 || nc<0 || nr>=row || nc>=col || board[nr][nc]!='O')return;
        board[nr][nc]='#';
        dfs(nr + 1, nc, board);
        dfs(nr - 1, nc, board);
        dfs(nr, nc + 1, board);
        dfs(nr, nc - 1, board);
    }
    public void solve(char[][] board) {
        int row=board.length;
        int col=board[0].length;
        
        for(int i=0;i<col;i++){
           if(board[0][i]=='O'){
            
            dfs(0,i,board);
            
           }
           if(board[row-1][i]=='O'){
           
            dfs(row-1,i,board);
            
           }
        }
        for(int i=0;i<row;i++){
           if(board[i][0]=='O'){
           
            dfs(i,0,board);
            
           }
           if(board[i][col-1]=='O'){
           
            dfs(i,col-1,board);
            
           }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
        
    }
}
