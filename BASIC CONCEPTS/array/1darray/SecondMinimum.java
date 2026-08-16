
import java.util.*;
import java.util.Arrays;

public class SecondMinimum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] matrix = new int[n];

        //input for matrix
        for (int i = 0; i < n; i++) {
            matrix[i] = sc.nextInt();
        }

        //print second elelmet first sort the elelmet
        Arrays.sort(matrix);
        if (n > 2) {
            System.out.print("The second minimum elelmet is:" + matrix[1]);
        } else {
            System.out.print("Please enter atleast 2 elements");
        }

    }
}
