import java.util.*;

public class PrimeNumberValue{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      boolean isPrime = n >= 2;

      for (int i = 2; isPrime && i <= n / i; i++) {
        if (n % i == 0) {
          isPrime = false;
        }
      }

      System.out.print(isPrime); 
    }
}