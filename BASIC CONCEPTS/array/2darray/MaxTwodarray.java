//Program to find the maximum value in a 2D array
import java.util.*;

public class MaxTwodarray {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the row to be entered:");
      int row=sc.nextInt();
      System.out.println("Enter the column to be entered:");
      int col=sc.nextInt();

      int[][] matrix=new int[row][col];
      
System.out.println("Enter the values:");
      for(int i=0;i<row;i++)
      {
        for (int j=0;j<col ;j++ )
        {
          matrix[i][j]=sc.nextInt();
        } 
      }

      int max=matrix[0][0];

      //Output
      for (int i=0;i<row ;i++ )
      {
        for (int j=0;j<col ;j++ )
        {
          if(max<matrix[i][j])
          {
            max=matrix[i][j];
          }
        }
        System.out.println(); 
      }

      System.out.println("Maximum value to be in array:" +max); 
    }
}