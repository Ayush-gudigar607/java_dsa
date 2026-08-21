
import java.util.*;

public class reverse {

    public static void reverseString(String str, int index) {
        //Base case if index is less than 0 then return
        if (index < 0) {
            return;
        }

        // //if(index==0)
        // {
        //     System.out.print(str.charAt(index));
        //     return;
        // }
        //recursive call for reverseString
        System.out.print(str.charAt(index));
        reverseString(str, index - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
        String str = sc.nextLine();
        //function call for reverseString
        reverseString(str, str.length() - 1);

    }
}
