//Program to reverse an array
import java.util.*;

public class reversearray {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();

      int[] matrix=new int[number];

      //Read the element for the matrix
      for (int i=0;i<number ;i++ )
      {
        matrix[i]=sc.nextInt();
      }

      //logic to reverse the array
      for (int i=number-1;i>=0;i--)
      {
        System.out.print(matrix[i]+" ");
      } 
    }
}