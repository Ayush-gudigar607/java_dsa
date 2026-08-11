//This is a simple Java program that calculates the factorial of a number using a function. The program prompts the user to enter an integer, then it calls the `factorial` function to compute its factorial and displays the result.
import java.util.Scanner;

public class factorial{
    public static int factorial(int n)
    {
  if(n<0)
  {
    System.out.println("Invalid Number");
    return -1;
  }

          int factorial=1;

         for (int i=n;i>=1;i--)
         {

          factorial=factorial*i;
         } 
         return factorial;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
System.out.print(factorial(n));    }

}
