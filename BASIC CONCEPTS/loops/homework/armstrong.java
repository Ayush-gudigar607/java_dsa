    import java.util.*;

public class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int remainder;
        double sum=0;
        int length=String.valueOf(n).length();

        while (n > 0) {
            remainder = n % 10;
            sum = sum + Math.pow(remainder,length);
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not a Armstrong number");
        }
    }
}

