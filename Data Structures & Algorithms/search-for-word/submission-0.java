class Solution {
    public boolean backtrack(int r,int c,char[][]board,String word,int i){
        if(i==word.length())return true;
        if(r<0||r>=board.length||c<0||c>=board[0].length||word.charAt(i)!=board[r][c])return false;

        char temp=board[r][c];
        board[r][c]='#';
        boolean  found=backtrack(r+1,c,board,word,i+1)||
        backtrack(r-1,c,board,word,i+1)||backtrack(r,c+1,board,word,i+1)||backtrack(r,c-1,board,word,i+1);
        board[r][c]=temp;
        return found;


    }

    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(backtrack(i,j,board,word,0))return true;
            }
        }return false;
    }
}
