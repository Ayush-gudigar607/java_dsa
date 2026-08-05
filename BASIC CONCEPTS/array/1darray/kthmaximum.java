import java.util.*;
import java.util.Arrays;

public class kthmaximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] matrix = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            matrix[i] = sc.nextInt();
        }

        // Read k
        int k = sc.nextInt();

        // Check if k is valid
        if (k <= 0 || k > n) {
            System.out.println("Invalid value of k");
            return;
        }

        // Sort the array
        Arrays.sort(matrix);

        // Print kth highest element
        System.out.println("The " + k + "th highest element is: " + matrix[n - k]);
    }
}