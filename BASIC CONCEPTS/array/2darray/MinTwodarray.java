//Program to find the minimum value in a 2D array

import java.util.*;

public class MinTwodarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row entered:");
        int row = sc.nextInt();
        System.out.println("Enter the column to be entered:");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter the values:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }

        int min = matrix[0][0];

        //Output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //logic to find the minimum value in a 2D array
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }

        System.out.println("Minimum value to be in array:" + min);
    }
}
