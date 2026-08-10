import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh) {
        // Scanner reads input from standard input (System.in)
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                // Try to read the input as a 64-bit signed long
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                
                // Check if value fits in a 8-bit byte (-128 to 127)
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                // Check if value fits in a 16-bit short (-32,768 to 32,767)
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                // Check if value fits in a 32-bit int (-2,147,483,648 to 2,147,483,647)
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                // If it successfully parsed as a long, it always fits in a 64-bit long
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                // If the number overflows long, nextLong() throws an exception
                // sc.next() retrieves the giant number as a string to print it
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
