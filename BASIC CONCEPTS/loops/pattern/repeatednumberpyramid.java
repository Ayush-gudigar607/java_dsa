import java.util.Scanner;

public class repeatednumberpyramid {
  /*
    Sample pattern (n = 5):
    11111
    2222
    333
    44
    5
  */
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of terms:");
      int n=sc.nextInt();
      int number=1;
      for(int i=n;i>=1;i--)
      {
        for(int j=1;j<=i;j++)
        {
          System.out.print(number);
        }
        number++;
        System.out.println();
      }
} 
}
