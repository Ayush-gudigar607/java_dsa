package backtracking;

import java.util.*;

public class Sudukusolver {

    public boolean isSafe(char[][] board, int row, int col, int number) {

        // Check row and column
        for (int i = 0; i < board.length; i++) {

            if (board[row][i] == (char)(number + '0')) {
                return false;
            }

            if (board[i][col] == (char)(number + '0')) {
                return false;
            }
        }

        // Find starting position of 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        // Check 3x3 subgrid
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {

                if (board[i][j] == (char)(number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {

        // Base case
        if (row == board.length) {
            return true;
        }

        int newrow = 0;
        int newcol = 0;

        // Move to next cell
        if (col != board.length - 1) {
            newrow = row;
            newcol = col + 1;
        } else {
            newrow = row + 1;
            newcol = 0;
        }

        // If cell already contains a number, skip it
        if (board[row][col] != '.') {
            return helper(board, newrow, newcol);
        }

        // Try numbers from 1 to 9
        for (int i = 1; i <= 9; i++) {

            if (isSafe(board, row, col, i)) {

                board[row][col] = (char)(i + '0');
                
                if (helper(board, newrow, newcol)) {
                    return true;
                }

                // Backtracking
                board[row][col] = '.';
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {

        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        Sudukusolver obj = new Sudukusolver();

        obj.solveSudoku(board);

        // Print solved Sudoku
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
