package level2;

/**
 * This program moves all 'x' characters to the end of a string
 * using recursion.
 *
 * Example:
 * Input  : "axbcxxd"
 * Output : "abcdxxx"
 *
 * Logic:
 * - If the current character is 'x', increase the count.
 * - If the current character is not 'x', add it to newString.
 * - Continue recursively until the end of the string.
 * - At the base case, add all counted 'x' characters to newString.
 */
public class Movex {

    /**
     * Moves all 'x' characters to the end of the string using recursion.
     *
     * @param str       input string
     * @param idx       current index of the string
     * @param count     number of 'x' characters found so far
     * @param newString string containing all non-'x' characters
     */
    public static void MoveX(String str, int idx, int count, String newString) {

        // Base case: reached the end of the string
        if (idx == str.length()) {

            // Add all the counted 'x' characters at the end
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }

            // Print the final string
            System.out.println(newString);
            return;
        }

        // Get the current character
        char currentChar = str.charAt(idx);

        // If current character is 'x'
        if (currentChar == 'x') {

            // Increase the count of 'x'
            count++;

            // Move to the next character
            MoveX(str, idx + 1, count, newString);

        } else {

            // Add the non-'x' character to newString
            newString += currentChar;

            // Move to the next character
            MoveX(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {

        // Input string
        String str = "axbcxxd";

        // Start recursion from index 0
        // count = 0 because no 'x' has been found yet
        // newString = "" because it is initially empty
        MoveX(str, 0, 0, "");
    }
}