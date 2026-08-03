import java.util.*;

public class MaxOnedarray {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number entered:");
      int number=sc.nextInt();
      

      int[] matrix=new int[number];
      
System.out.println("Enter the values:");
      for(int i=0;i<number;i++)
      {
        matrix[i]=sc.nextInt();
      }

      int max=matrix[0];

      //Output
      for (int i=0;i<number;i++ )
      {
        if(max<matrix[i])
          {
            max=matrix[i];
          }
      }

      System.out.println("Maximum value to be in array:" +max); 
    }
}