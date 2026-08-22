package level2;

import java.util.HashSet;

public class uniquesubsequent {

    // Generates all unique subsequences using recursion
    public static void subsequences(
            String str, int idx, String newString, HashSet<String> set) {

        // Base case: all characters are processed
        if (idx == str.length()) {

            // Check if this subsequence already exists
            if (set.contains(newString)) {
                return;
            } else {

                // Print and store the new subsequence
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        // Get the current character
        char currentChar = str.charAt(idx);

        // Choice 1: Include the current character
        subsequences(
                str, idx + 1, newString + currentChar, set
        );

        // Choice 2: Do not include the current character
        subsequences(
                str, idx + 1, newString, set
        );
    }

    public static void main(String args[]) {

        // Input string
        String str = "aaa";

        // HashSet stores subsequences that are already printed
        HashSet<String> set = new HashSet<>();

        // Start recursion from index 0
        subsequences(str, 0, "", set);
    }
}
