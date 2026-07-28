import java.util.*;

public class prime {

  public static boolean isPrime(int n) {
    if (n == 1) {
      System.out.print("neither a number nor a composite");
      return false;
    }
    if (n <= 0) {
      System.out.print("Enter the valid number");
      return false;
    }
    if (n == 2) {
      return true;
    }
    if (n % 2 == 0) {
      return false;
    }

    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    boolean res = isPrime(n);
    // If isPrime already printed an error message, don't print prime/composite again
    if (n == 1 || n <= 0) return;

    if (res) System.out.print("Prime number");
    else System.out.print("Not a prime number");
  }
}