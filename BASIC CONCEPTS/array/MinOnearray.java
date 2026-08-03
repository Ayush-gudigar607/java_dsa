import java.util.*;

public class MinOnearray {
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

      int min=matrix[0];

      //Output
      for (int i=0;i<number;i++ )
      {
        if(min>matrix[i])
          {
            min=matrix[i];
          }
      }

      System.out.println("Minimum value to be in array:" +min); 
    }
}