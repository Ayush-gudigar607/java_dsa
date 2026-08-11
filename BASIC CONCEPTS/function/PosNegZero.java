//This is a simple Java program that counts the number of positive, negative, and zero integers entered by the user. The program continues to accept integers until the user enters -1, at which point it displays the counts of positive, negative, and zero numbers.

import java.util.*;

public class PosNegZero{

    static int positivecount = 0;
    static int negativeCount = 0;
    static int zeroCount = 0;

    public static void positiveNegativeZero(int n) {

        if (n > 0) {
            positivecount++;
        } else if (n == 0) {
            zeroCount++;
        } else {
            negativeCount++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == -1)
                break;

            positiveNegativeZero(n);
        }

        System.out.println("Positive = " + positivecount);
        System.out.println("Negative = " + negativeCount);
        System.out.println("Zero = " + zeroCount);
    }
}