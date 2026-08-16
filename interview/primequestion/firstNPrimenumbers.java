
import java.util.Scanner;

public class firstNPrimenumbers {

    public static void printNumbers(int count) {
        int printed = 0;
        int num = 2;

        while (printed < count) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                printed++;
            }

            num++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            //here we can use Math.sqrt(n) instead of n/2 to reduce the number of iterations, but for simplicity, we are using n/2
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // if (n == 1) {
        //     System.out.print("2");
        // } else if (n == 2) {
        //     System.out.print("2 3");
        // } else {
        //     printNumbers(n);
        // }

        printNumbers(n);
    }
}
