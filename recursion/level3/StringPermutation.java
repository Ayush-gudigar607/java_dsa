package level3;

/*
 * This program prints all possible permutations
 * of a given string using recursion.
 *
 * Example:
 * Input: abc
 *
 * Output:
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 */

public class StringPermutation {

    /*
     * str = characters that are still left
     * permutation = characters that are already selected
     */
    public static void printPermutation(String str, String permutation) {

        // Base case: no characters are left
        if (str.length() == 0) {

            // Print the completed permutation
            System.out.println(permutation);
            return;
        }

        // Choose each character one by one
        for (int i = 0; i < str.length(); i++) {

            // Select the current character
            char currentchar = str.charAt(i);

            // Remove the selected character from str
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Add the selected character to permutation
            // and recursively call the function
            printPermutation(newStr, permutation + currentchar);
        }
    }

    public static void main(String[] args) {

        // Input string
        String str = "abc";

        // Start recursion with an empty permutation
        printPermutation(str, "");
    }
}