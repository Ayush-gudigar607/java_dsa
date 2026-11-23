
package backtracking;

import java.util.ArrayList;
import java.util.List;

public class nqueen {

    public boolean isSafe(int row, int col, char[][] board) {

        // Horizontal left
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Upper left diagonal
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Lower left diagonal
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveboard(char[][] board, List<List<String>> allboards) {

        List<String> board1 = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {

            String row = "";

            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }

            board1.add(row);
        }

        allboards.add(board1);
    }

    public void helper(char[][] board, List<List<String>> allboards, int col) {

        // Base case
        if (col == board.length) {
            saveboard(board, allboards);
            return;
        }

        // Try every row in the current column
        for (int row = 0; row < board.length; row++) {

            if (isSafe(row, col, board)) {

                board[row][col] = 'Q';

                helper(board, allboards, col + 1);

                // Backtracking
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> allboards = new ArrayList<>();

        char[][] board = new char[n][n];

        // Initialize board with empty cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allboards, 0);

        return allboards;
    }

    public static void main(String[] args) {

        nqueen obj = new nqueen();

        List<List<String>> result = obj.solveNQueens(4);

        for (List<String> board : result) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
