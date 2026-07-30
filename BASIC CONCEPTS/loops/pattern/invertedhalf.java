import java.util.Scanner;
public class invertedhalf {
        /*
            Sample pattern (n = 5):
            *****
            ****
            ***
            **
            *
        */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
         for (int j=1;j<=n-i;j++)
         {
         System.out.print("*");
         }
         System.out.println();
          
        }
    }
}
