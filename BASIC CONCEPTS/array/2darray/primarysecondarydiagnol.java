import java.util.*;

public class primarysecondarydiagnol {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      int col=sc.nextInt();
      int index=0;

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
      //printing the primary diagonal
      for (int i=0;i<row ;i++ )
      {
        for (int j=0;j<col ;j++ )
        {
          if(i==j)
          {
            primarydiagonal[index]=matrix[i][j];
            index++;
          }
        } 
      }


      index=0;

      //Printing secondary diagonal
      for (int i=0;i<row ;i++ )
      {
        for(int j=0;j<col;j++)
        {
          if(i+j==row-1)
          {
            secondaryDiagonal[index]=matrix[i][j];
            index++;
          }
        }
      } 

 //for primary diagonal
      for(int i=0;i<primarydiagonal.length;i++)
      {
        System.out.print(primarydiagonal[i]+" ");
      }
      System.out.println();
//for secondary diagonal
       for(int i=0;i<secondaryDiagonal.length;i++)
      {
        System.out.print(secondaryDiagonal[i]+" ");
      }
      
    }
}