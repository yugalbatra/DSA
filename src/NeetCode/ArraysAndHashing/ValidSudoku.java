package NeetCode.ArraysAndHashing;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !isValid(board, i, j, board[i][j])) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValid(char[][] board, int i, int j, char ch) {
        for (int a = 0; a < 9; a++) {
            if ((a != j && board[i][a] == ch) || (a != i && board[a][j] == ch)) {
                return false;
            }
        }

        int startI = 3 * (i / 3);
        int startJ = 3 * (j / 3);
        for (int a = startI; a < startI + 3; a++) {
            for (int b = startJ; b < startJ + 3; b++) {
                if (a == i && b == j) continue;
                if (board[a][b] == ch) return false;
            }
        }

        return true;
    }
}
