package level3;

/**
 * This class generates all permutations of a given string using recursion.
 */
public class StringPermutation {

    /**
     * Generates and prints all possible permutations of the string.
     *
     * @param str The characters that are still available to choose.
     * @param permutation The characters already selected for the permutation.
     */
    public static void printPermutation(String str, String permutation) {

        /*
         * Base Case:
         *
         * If there are no characters left in str,
         * the permutation is complete.
         */
        if (str.length() == 0) {

            // Print the completed permutation.
            System.out.println(permutation);

            // Stop this recursive call.
            return;
        }

        /*
         * Try every character in the current string.
         *
         * For example:
         *
         * str = "abc"
         *
         * i = 0 -> choose 'a'
         * i = 1 -> choose 'b'
         * i = 2 -> choose 'c'
         */
        for (int i = 0; i < str.length(); i++) {

            // Select the character at index i.
            char currentchar = str.charAt(i);

            /*
             * Remove the selected character from the string.
             *
             * Example:
             *
             * str = "abc"
             * i = 1
             *
             * str.substring(0, 1) = "a"
             * str.substring(2)    = "c"
             *
             * newStr = "a" + "c"
             *        = "ac"
             */
            String newStr
                    = str.substring(0, i) + str.substring(i + 1);

            /*
             * Recursively generate permutations using:
             *
             * 1. newStr       -> remaining characters
             * 2. permutation + currentchar
             *                  -> selected characters
             */
            printPermutation(
                    newStr,
                    permutation + currentchar
            );
        }
    }

    /**
     * Main method.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Input string.
        String str = "abc";

        /*
         * Start permutation generation.
         *
         * str = "abc"
         * permutation = ""
         */
        printPermutation(str, "");
    }
}
