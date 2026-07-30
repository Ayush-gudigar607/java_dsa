import java.util.Scanner;

public class pascalTraingle {
    /*
      Sample pattern (n = 5):
          1
         1 1
        1 2 1
       1 3 3 1
      1 4 6 4 1
    */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of terms:");
      int n=sc.nextInt();
      for (int i=1;i<=n ;i++)
      {
        for (int j=1;j<=n-i ;j++ )
        {
          System.out.print(" ");
        } 
        int number=1;
        for (int j=1;j<=i ;j++ )
        {
          System.out.print(number+" ");
          number=number*(i-j)/(j);
        } 
        System.out.println();
      } 
}
}
