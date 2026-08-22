package level2;

import java.util.*;

public class reverse {

    // Recursively prints the string in reverse order
    public static void reverseString(String str, int index) {

        // Base case: index goes before the first character
        if (index < 0) {
            return;
        }

        // Print the current character
        System.out.print(str.charAt(index));

        // Move to the previous character
        reverseString(str, index - 1);
    }

    public static void main(String args[]) {

        // Create Scanner to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take the string as input
        System.out.println("Enter the string to be reversed");
        String str = sc.nextLine();

        // Start recursion from the last character
        reverseString(str, str.length() - 1);
    }
}