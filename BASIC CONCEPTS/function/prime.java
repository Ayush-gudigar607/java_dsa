//This is a simple Java program that checks if a number is prime using a function. The program prompts the user to enter an integer, then it calls the `isPrime` function to determine if the number is prime and displays the result.

import java.util.*;

public class prime {

    public static boolean isPrime(int n) {
        if (n == 1) {
            System.out.print("neither a number nor a composite");
            return false;
        }
        if (n <= 0) {
            System.out.print("Enter the valid number");
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1 || n <= 0) {
            return;
        }

        boolean res = isPrime(n);
        // If isPrime already printed an error message, don't print prime/composite again

        if (res) {
            System.out.print("Prime number"); 
        }else {
            System.out.print("Not a prime number");
        }
    }
}
