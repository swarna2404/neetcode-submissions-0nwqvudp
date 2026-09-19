class Solution {
    public boolean isValidSudoku(char[][] board) {

        //check rows
        for(int i=0;i<9;i++){
            boolean[] seen=new boolean[10];
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch=='.')continue;
                int num=ch-'0';
                if(seen[num])return false;
                seen[num]=true;
            }
        }
        //check cols
        for(int i=0;i<9;i++){
            boolean[] seen=new boolean[10];
            for(int j=0;j<9;j++){
                char ch=board[j][i];
                if(ch=='.')continue;
                int num=ch-'0';
                if(seen[num])return false;
                seen[num]=true;
            }
        }
        //check subboxes

        for(int box=0;box<9;box++){
            boolean[] seen=new boolean[10];
            int startRow=(box/3) *3;
            int startCol=(box%3)*3;
            for(int i=startRow;i<startRow+3;i++){
                for(int j=startCol;j<startCol+3;j++){
                    char ch=board[j][i];
                    if(ch=='.')continue;
                    int num=ch-'0';
                    if(seen[num])return false;
                    seen[num]=true;

                }
            }
        }
        return true;

        
    }
}
