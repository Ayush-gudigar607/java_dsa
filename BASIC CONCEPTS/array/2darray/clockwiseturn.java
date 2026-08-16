//Program to print the elements of a 2D array in clockwise order
import java.util.*;

public class clockwiseturn {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      int col=sc.nextInt();

      int[][] matrix=new int[row][col];
      int[] primarydiagonal=new int[row];
      int[] secondaryDiagonal=new int[row];

      for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
        {
          matrix[i][j]=sc.nextInt();
        }
      }

      //keep the j as constant 
      for(int j=0;j<col;j++)
      {
        for (int i=row-1;i>=0 ;i--)
        {
          System.out.print(matrix[i][j]+" ");
        } 
        System.out.println();
      }
    }
}