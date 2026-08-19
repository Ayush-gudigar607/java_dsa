//this is a simple Java program that calculates the average of three numbers using a function. The program prompts the user to enter three integers, then it calls the `average` function to compute their average and displays the result.

import java.util.Scanner;

public class threeaverage {

    public static void average(int n1, int n2, int n3) {
        System.out.print(((n1 + n2 + n3) / (3)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n1:");
        int n1 = sc.nextInt();
        System.out.print("Enter the value of n2:");
        int n2 = sc.nextInt();
        System.out.print("Enter the value of n3:");
        int n3 = sc.nextInt();
        average(n1, n2, n3);

    }
}
