import java.util.*;

public class reversearray {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();

      int[] matrix=new int[number];

      //input
      for (int i=0;i<number ;i++ )
      {
        matrix[i]=sc.nextInt();
      }
      //output
      for (int i=number-1;i>=0;i--)
      {
        System.out.print(matrix[i]+" ");
      } 
    }
}