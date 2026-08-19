
import java.util.*;

public class Functions {

    public static void printMyName(String Name) {
        System.out.println(Name);
        return;
    }

    public static void Function(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        printMyName(Name);
    }
}
