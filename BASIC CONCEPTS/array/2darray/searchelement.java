import java.util.*;

public class searchelement {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col=sc.nextInt();
        int[][] numbers=new int[row][col];

        // Input the value
        System.out.println("Enter the values to be entered:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the element to be find:");
        int number=sc.nextInt();

        System.out.println("The Entered values are:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
              if(numbers[i][j]==number)
              {
                System.out.print("number found at location:"+(i)+" "+j);
              }
            }
            System.out.println();
        }
    }
}