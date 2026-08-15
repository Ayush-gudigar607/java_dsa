
import java.util.Scanner;

public class OptimizedfirstNPrimenumbers {

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

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.print("2");
        } else if (n == 2) {
            System.out.print("2 3");
        } else {
            printNumbers(n);
        }
    }
}
