package level2;

import java.util.HashSet;

public class uniquesubsequent {

    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {

        if (idx == str.length()) {
            //if the newString is already present in the set then return else print the newString and add it to the set
            if (set.contains(newString)) {
                return;
            } else {
                //print the newString and add it to the set
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        //get the current character
        char currentChar = str.charAt(idx);

        //two choices =choose or not choose
        //to be 
        subsequences(str, idx + 1, newString + currentChar, set);

        //not to be 
        subsequences(str, idx + 1, newString, set);
    }

    public static void main(String args[]) {
        //test case for unique subsequent
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}
