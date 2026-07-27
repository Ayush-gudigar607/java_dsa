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
