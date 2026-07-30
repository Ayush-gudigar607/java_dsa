import java.util.Scanner;

public class numberpyramid {
 /*
     Sample pattern (n = 5):
             1
            2 2
         3 3 3
        4 4 4 4
     5 5 5 5 5
 */
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(i+" "); //for printing numbers in pyramid pattern
            } 
            System.out.println();
        }
    }   
}
