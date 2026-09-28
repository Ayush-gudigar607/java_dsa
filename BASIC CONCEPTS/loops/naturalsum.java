import java.util.Scanner;

public class naturalsum {
  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
      //logic for sum of the value
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}  
}
