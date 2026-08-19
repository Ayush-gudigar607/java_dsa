
import java.util.*;

public class even {

    public static int evenvalue(int n) {
        if (n % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = evenvalue(n);
        // If isPrime already printed an error message, don't print prime/composite again

        if (res == 1) {
            System.out.print("Even number");
        } else {
            System.out.print("odd number ");
        }
    }
}
