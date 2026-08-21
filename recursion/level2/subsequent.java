package level2;

public class subsequent {

    public static void subsequences(String str, int idx, String newString) {

        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);

        //two choices =choose or not choose
        //to be 
        subsequences(str, idx + 1, newString + currentChar);
 
        //not to be 
        subsequences(str, idx + 1, newString);
    }

    public static void main(String args[]) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
