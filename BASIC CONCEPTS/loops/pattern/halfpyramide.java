import java.util.Scanner;
public class halfpyramide {
  /*
    Sample pattern (n = 5):
    *
    * *
    * * *
    * * * *
    * * * * *

    Note: This program prints one extra blank line after each row.
  */
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
         for (int j=1;j<=i;j++)
         {
        System.out.print(" *");
         }
         System.out.println();
          
         System.out.println();          
        }   
}
}
