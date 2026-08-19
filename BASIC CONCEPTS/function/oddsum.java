//this is a simple Java program that calculates the sum of the first n odd numbers using a function. The program prompts the user to enter an integer n, then it calls the `oddSum` function to compute the sum of the first n odd numbers and displays the result.

import java.util.*;

public class oddsum {

    public static void oddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.print("Sum of odd numbers:" + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddSum(n);

    }
}

// import java.util.*;
// public class oddsum {
//   public static  void  oddSum(int n) {
//     int sum=0;
//     int countOdd=1;
//     for(int i=1;i<=n;i++)
//     {
//       sum+=countOdd;
//       countOdd+=2;
//     }
//     System.out.print("Sum of odd numbers:"+sum);
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n=sc.nextInt();
//     oddSum(n);    
//   }
// }
// import java.util.*;
// public class oddsum {
//   public static  void  oddSum(int n) {
//     int sum=0;
//     for(int i=1;i<=n;i++)
//     {
//       sum=sum+(2*i-1);
//     }
//     System.out.print("Sum of odd numbers:"+sum);
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n=sc.nextInt();
//     oddSum(n);    
//   }
// }
// ****best method*****
// public class oddSum{
//   public static void main(String[] args)
//   {
//     int n=10;
//     int sum=n*n;
//     System.out.println("Sum of odd numbers:"+sum);
//   }
// }

