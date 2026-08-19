
import java.util.*;

public class SumOfEvenNumbers {

    public static int SumOfEvenNumbers(int n) {
        return n * (n + 1);
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(SumOfEvenNumbers(n));
    }
}
