//Program to find the sum of a matrix

import java.util.*;

public class sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int sum = 0;

        int[][] matrix = new int[row][col];
//taking input of matrix from user
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
//logic to find the sum of a matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of the matrix is:" + sum);

    }
}
