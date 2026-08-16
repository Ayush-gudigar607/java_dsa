//Program to find the transpose of a matrix

import java.util.*;

public class Transpoce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        //input for matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output for transpoce matrix(exchanging rows and columns)
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
