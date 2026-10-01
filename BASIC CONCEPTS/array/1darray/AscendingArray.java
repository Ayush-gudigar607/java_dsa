import java.util.*;

public class AscendingArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int previous = sc.nextInt();
        boolean isAscending = true;

        for (int i = 1; i < length; i++) {

            int current = sc.nextInt();

            if (previous > current) {
                isAscending = false;
            }

            previous = current;
        }

        System.out.print(isAscending);
    }
}