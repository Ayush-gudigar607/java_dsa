package level2;

import java.util.HashSet;

public class uniquesubsequent{

    public static void subsequences(String str, int idx, String newString,HashSet<String> set) {

        if (idx == str.length()) {
           if(set.contains(newString))
           {
            return;
           }
           else
           {
            System.out.println(newString);
            set.add(newString);
            return;
           }
        }

        char currentChar = str.charAt(idx);

        //two choices =choose or not choose
        //to be 
        subsequences(str, idx + 1, newString + currentChar,set);
 
        //not to be 
        subsequences(str, idx + 1, newString,set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set=new HashSet<>();
        subsequences(str, 0, "",set);
    }
}
