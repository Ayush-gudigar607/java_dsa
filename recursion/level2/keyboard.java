package level2;

/**
 * This program prints all possible letter combinations
 * for the given keypad digits using recursion.
 *
 * Example:
 * Input  : "23"
 *
 * 2 -> def
 * 3 -> ghi
 *
 * Output:
 * dg
 * dh
 * di
 * eg
 * eh
 * ei
 * fg
 * fh
 * fi
 */
public class keyboard {

    // Keypad mapping
    // 2 -> def, 3 -> ghi
    public static String keypad[] = {
        ".", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tu", "vwx", "yz"
    };

    // Generates all possible combinations
    public static void printKeypad(String str, int idx, String cominations) {

        // Base case: all digits are processed
        if (idx == str.length()) {
            System.out.println(cominations);
            return;
        }

        // Get current digit
        char currentChar = str.charAt(idx);

        // Get letters mapped to the digit
        // Example: '2' -> "def"
        String mapping = keypad[currentChar - '0'];

        // Try every letter of the current digit
        for (int i = 0; i < mapping.length(); i++) {

            // Choose a letter and move to the next digit
            printKeypad(
                str,
                idx + 1,
                cominations + mapping.charAt(i)
            );

            // Executes after the recursive call returns
            System.out.println(
                "cominations: " + cominations +
                " mapping.charAt(i): " + mapping.charAt(i)
            );
        }
    }

    public static void main(String args[]) {

        String str = "23";

        // Start recursion
        printKeypad(str, 0, "");
    }
}