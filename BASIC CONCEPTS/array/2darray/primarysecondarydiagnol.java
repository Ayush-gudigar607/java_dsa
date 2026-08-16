//Program to find the primary and secondary diagonal of a matrix

import java.util.*;

public class primarysecondarydiagnol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int index = 0;
        //creating a matrix and two arrays to store the primary and secondary diagonal elements
        int[][] matrix = new int[row][col];
        int[] primarydiagonal = new int[row];
        int[] secondaryDiagonal = new int[row];

        //taking input of matrix from user
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //printing the primary diagonal
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //checking if the element is in primary diagonal or not
                if (i == j) {
                    primarydiagonal[index] = matrix[i][j];
                    index++;
                }
            }
        }

        index = 0;

        //Printing secondary diagonal
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //checking if the element is in secondary diagonal or not
                if (i + j == row - 1) {
                    secondaryDiagonal[index] = matrix[i][j];
                    index++;
                }
            }
        }

        //for primary diagonal
        for (int i = 0; i < primarydiagonal.length; i++) {
            System.out.print(primarydiagonal[i] + " ");
        }
        System.out.println();
//for secondary diagonal
        for (int i = 0; i < secondaryDiagonal.length; i++) {
            System.out.print(secondaryDiagonal[i] + " ");
        }

    }
}

//second and best method
// import java.util.*;
// public class primarysecondarydiagnol {
//     public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       int row=sc.nextInt();
//       int col=sc.nextInt();
//       int[][] matrix=new int[row][col];
//       int[] primarydiagonal=new int[row];
//       int[] secondaryDiagonal=new int[row];
//       for(int i=0;i<row;i++)
//       {
//         for(int j=0;j<col;j++)
//         {
//           matrix[i][j]=sc.nextInt();
//         }
//       }
//       //printing the primary diagonal
//       for (int i=0;i<row ;i++ )
//       {
//         primarydiagonal[i]=matrix[i][i];
//       } 
//       for (int i=0;i<row ;i++ )
//       {
//         secondaryDiagonal[i]=matrix[i][col-1-i];
//       } 
//  //for primary diagonal
//       for(int i=0;i<primarydiagonal.length;i++)
//       {
//         System.out.print(primarydiagonal[i]+" ");
//       }
//       System.out.println();
// //for secondary diagonal
//        for(int i=0;i<secondaryDiagonal.length;i++)
//       {
//         System.out.print(secondaryDiagonal[i]+" ");
//       }
//     }
// }
