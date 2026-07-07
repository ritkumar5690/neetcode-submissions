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
        int si = (i / 3) * 3;
        int ei = si +2;
        int sj = (j / 3) * 3;
        int ej = sj +2;

        int count = 0;
        for (int row = si; row <= ei; row++) {
            for (int col = sj; col <= ej; col++) {
                if(row == i && col == j) continue;
                if (board[row][col] == board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
