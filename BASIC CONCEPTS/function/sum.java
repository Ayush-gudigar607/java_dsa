//This is a simple Java program that calculates the sum of two numbers using a function. The program prompts the user to enter two integers, then it calls the `sum` function to compute their sum and displays the result.

import java.util.Scanner;

public class sum {

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the one number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("The final result is:");
        int result = sum(a, b);
        System.out.println(result);
    }
}
