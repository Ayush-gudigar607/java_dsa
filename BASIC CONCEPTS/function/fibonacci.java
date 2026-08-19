//this is a simple Java program that generates the Fibonacci sequence up to a specified number of terms using a function. The program prompts the user to enter an integer n, then it calls the `Fibonacci` function to compute and display the first n terms of the Fibonacci sequence.

import java.util.Scanner;

public class fibonacci {

    public static void Fibanacci(int n) {
        int t1 = 0;
        int t2 = 1;
        //print the first two terms of the Fibonacci sequence(0 and 1)
        System.out.print(t1 + " " + t2 + " ");
        for (int i = 3; i <= n; i++) {
            int sum = t1 + t2;
            System.out.print(sum + " ");
            t1 = t2;
            t2 = sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibanacci(n);
    }
}
