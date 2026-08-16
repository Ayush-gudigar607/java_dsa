
import java.util.*;

public class leftRotate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//taking the size of the array from user
        int n = sc.nextInt();
        int[] matrix = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            matrix[i] = sc.nextInt();
        }
        // rotating the array to the left by one position
        int temp = matrix[0];
        for (int i = 0; i < n - 1; i++) {
            matrix[i] = matrix[i + 1];
        }

        // shifting the elements of the array to the left by one position
        matrix[n - 1] = temp;

        //printing the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i] + " ");
        }

    }
}
