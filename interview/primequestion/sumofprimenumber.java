
import java.util.Scanner;

public class sumofprimenumber {

    public static void printNumbers(int count) {
        int num = 2;
        int index = 0;

        int arr[] = new int[count];

        while (index < count) {
            if (isPrime(num)) {
                arr[index] = num;
                index++;
            }
            num++;
        }
        int sum = 0;
        // Print the array
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        System.out.print(sum);

    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
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
