
import java.util.Scanner;

public class PrimebetweenNumbers {

    public static void printNumbers(int n1, int n2) {
        // int start=Math.min(n1,n2);
        // int end=Math.max(n1,n2);

        for (int i = n1 + 1; i < n2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

            // for(int i=start+1;i<end;i++)
            // {
            //     if(isPrime(i))
            //     {
            //         System.out.print(i+" ");
            //     }
            // }

        }

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
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 == 1 && n2 == 1) {
            System.out.print("2");
        } else if (n1 == 2 && n2 == 1) {
            System.out.print("2 3");
        } else {
            printNumbers(n1, n2);
        }
    }
}
