//this is a simple Java program that calculates the greatest common divisor (GCD) of two integers using a function. The program prompts the user to enter two integers, then it calls the `GCD` function to compute their GCD and displays the result.

import java.util.*;

public class gcd {

    public static void GCD(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.print(gcd);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        GCD(n1, n2);
    }
}
