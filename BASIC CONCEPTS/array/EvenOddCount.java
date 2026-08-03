import java.util.*;

public class EvenOddCount {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();

      int[] matrix=new int[number];
      int countEven=0;
      int countOdd=0;

      //input
      for (int i=0;i<number ;i++ )
      {
        matrix[i]=sc.nextInt();
      }
      //output
      for (int i=number-1;i>=0;i--)
      {
        if(matrix[i]%2==0)
        {
          countEven++;
        }
        else{
          countOdd++;
        }
      }
      System.out.println("Even:"+countEven);
      System.out.println("Odd:"+countOdd); 
    }
}