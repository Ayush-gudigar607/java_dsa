import java.util.Scanner;

public class spatialmatrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row:");
        int rows=sc.nextInt();
        System.out.println("Enter the column:");
        int cols=sc.nextInt();

        int[][] matrix=new int[rows][cols];
       System.out.println("Enter the matrix to be entered:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Spatial Matrix:");

        int row_start=0;
        int row_end=rows-1;
        int col_start=0;
        int col_end=cols-1;

        while(row_start<=row_end && col_start<=col_end)
        {

            //1
            for(int col=col_start;col<=col_end;col++)
            {
                System.out.print(matrix[row_start][col]+" ");
            }
            row_start++;

            //2
            for (int row=row_start;row<=row_end ;row++ )
            {
                System.out.print(matrix[row][col_end]+" ");
            } 
            col_end--;

            //3
            for(int col=col_end;col>=col_start;col--)
            {
                System.out.print(matrix[row_end][col]+" ");
            }
            row_end--;

            //4
            for (int row=row_end;row>=row_start ;row-- )
            {
                System.out.print(matrix[row][col_start]+" ");
            }
            col_start++;

            System.out.println(); 
        }


    }
}