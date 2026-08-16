//Program to find the sum of each column of a matrix

import java.util.*;

public class colsums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int colsum = 0;

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //logic to find the sum of each column of a matrix
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                colsum += matrix[i][j];
            }

            System.out.println(" sum of " + j + " col is:" + colsum);
            //resetting the colsum to 0 for next column
            colsum = 0;
        }

    }
}
