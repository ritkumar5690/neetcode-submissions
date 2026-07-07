class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] >= '1' && board[i][j] <= '9'){
                    if (!checkRow(i, j, board))
                        return false;
                    if (!checkCol(i, j, board))
                        return false;
                    if (!checkBox(i, j, board))
                        return false;
                }
            }
        }
        return true;
    }
    private boolean checkRow(int i, int pos, char[][] board) {
        for (int j = 0; j < 9; j++) {
            if (j == pos)
                continue;
            if (board[i][j] == board[i][pos])
                return false;
        }
        return true;
    }
    private boolean checkCol(int pos, int j, char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (i == pos)
                continue;
            if (board[i][j] == board[pos][j])
                return false;
        }
        return true;
    }
    private boolean checkBox(int i, int j, char[][] board) {
        if (i <= 2) {
            if (j <= 2) {
                for(int row =0;row<=2;row++){
                    for(int col = 0;col<=2;col++){
                        if(i == row && j== col) continue;
                        if(board[i][j] == board[row][col]) return false;
                    }
                }
            }
            else if (j > 2 && j <= 5) {
                for(int row =0;row<=2;row++){
                    for(int col = 3;col<=5;col++){
                        if(i == row && j== col) continue;
                        if(board[i][j] == board[row][col]) return false;
                    }
                }
            } else {
                for(int row =0;row<=2;row++){
                    for(int col = 6;col<=8;col++){
                        if(i == row && j== col) continue;
                        if(board[i][j] == board[row][col]) return false;
                    }
                }
            }
        }
        else if (i > 2 && i <= 5) {
            if (j <= 2) {
                for(int row =3;row<=5;row++){
                    for(int col = 0;col<=2;col++){
                        if(i == row && j== col) continue;
                        if(board[i][j] == board[row][col]) return false;
                    }
                }
            }
            else if (j > 2 && j <= 5) {
                for(int row =3;row<=5;row++){
                    for(int col = 3;col<=5;col++){
                        if(i == row && j== col) continue;
                        if(board[i][j] == board[row][col]) return false;
                    }
                }
            } else {
                for(int row =3;row<=5;row++){
                    for(int col = 6;col<=8;col++){
                        if(i == row && j== col) continue;
                        if(board[i][j] == board[row][col]) return false;
                    }
                }
            }
        }
        else {
            if(j<=2){
                for(int row =6;row<=8;row++){
                    for(int col = 0;col<=2;col++){
                        if(i == row && j== col) continue;
                        if(board[i][j] == board[row][col]) return false;
                    }
                }
            }
            else if(j>2 && j<=5){
                for(int row =6;row<=8;row++){
                    for(int col = 3;col<=5;col++){
                        if(i == row && j== col) continue;
                        if(board[i][j] == board[row][col]) return false;
                    }
                }
            }
            else{
                for(int row =6;row<=8;row++){
                    for(int col = 6;col<=8;col++){
                        if(i == row && j== col) continue;
                        if(board[i][j] == board[row][col]) return false;
                    }
                }   
            }
        }
        return true;
    }
}
