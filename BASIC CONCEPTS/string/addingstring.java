import java.util.*;

public class addingstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // concatination
        String name = sc.nextLine();
        String lastname = sc.nextLine();
        System.out.print(name + "@" + lastname);
        sc.close();
    }
}
