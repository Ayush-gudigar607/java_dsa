package level2;

public class duplicate {

    // Stores whether a character has already appeared
    // a -> index 0, b -> index 1, c -> index 2, ...
    public static boolean[] map = new boolean[26];

    // Removes duplicate characters using recursion
    public static void removeDuplicates(String str, int idx, String newString) {

        // Base case: all characters are processed
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        // Get the current character
        char currentChar = str.charAt(idx);

        // Check whether the character is already present
        if (map[currentChar - 'a'] == true) {

            // Character is duplicate, so skip it
            removeDuplicates(str, idx + 1, newString);

        } else {

            // Character is new, so add it
            newString += currentChar;

            // Mark the character as already present
            map[currentChar - 'a'] = true;

            // Move to the next character
            removeDuplicates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {

        String str = "abbccdd";

        // Start recursion from index 0
        removeDuplicates(str, 0, "");
    }
}