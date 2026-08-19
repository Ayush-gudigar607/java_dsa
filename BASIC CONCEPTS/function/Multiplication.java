
import java.util.*;

public class Multiplication {

    public static int sum(int result) {
        System.out.print("multiply of two numbers:" + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a * b;
        sum(result);

    }
}
