package level2;

public class firstlastindex {

    // Stores the first and last index of the element
    static int first = -1;
    static int last = -1;

    // Finds the first and last occurrence using recursion
    public static void firstLastIndex(String str, char ele, int index) {

        // Base case: reached the end of the string
        if (index == str.length()) {
            return;
        }

        // Get the current character
        char currentChar = str.charAt(index);

        // Check if current character is the element
        if (currentChar == ele) {

            // Store the first occurrence
            if (first == -1) {
                first = index;
            } // Update last whenever element is found again
            else {
                last = index;
            }
        }

        // Move to the next character
        firstLastIndex(str, ele, index + 1);
    }

    public static void main(String args[]) {

        // Input string
        String str = "abcaacd";

        // Element whose first and last index we need
        char ele = 'a';

        // Start recursion from index 0
        firstLastIndex(str, ele, 0);

        // Print the result
        System.out.println("First index: " + first);
        System.out.println("Last index: " + last);
    }
}
