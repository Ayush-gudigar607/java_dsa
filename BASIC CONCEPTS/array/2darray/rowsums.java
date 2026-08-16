//Program to find the sum of each row of a matrix
import java.util.*;

public class rowsums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int rowsum = 0;

        int[][] matrix = new int[row][col];

        //taking input of matrix from user
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //logic to find the sum of each row of a matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rowsum += matrix[i][j];
            }

            System.out.println(" sum of " + i + " row is:" + rowsum);
            //resetting the rowsum to 0 for next row
            rowsum = 0;
        }
    }
}
