package level2;

public class duplicate {
   //make boolean array of size 26 to store the elements which are already present in the string
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString) {
        //if the index is equal to the length of the string then print the newString and return
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        //get the current character
        char currentChar = str.charAt(idx);
        //already element is there then this condition
        if (map[currentChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newString);
        } else {
            //if the element is new then add the element then make it true
            newString += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccdd";
        removeDuplicates(str, 0, "");
    }

}
