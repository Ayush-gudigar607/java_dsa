import java.util.Scanner;

public class zeroone {
 /*
   Sample pattern (n = 5):
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
 */
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
              if((i+j)%2==0)
              {
                System.out.print(" 1");
              }
              else{
                System.out.print(" 0");
              }
            }
            System.out.println();
        }
    }   
}
