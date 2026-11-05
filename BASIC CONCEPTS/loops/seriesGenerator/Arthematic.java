package seriesGenerator;

import java.util.Scanner;

class Arthematic {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int currentTerm = a;
        System.out.print(currentTerm + " ");

        for (int i = 1; i <= n - 1; i++) {
            currentTerm = currentTerm + b;
            System.out.print(currentTerm + " ");

        }

    }
}
