import java.util.*;

public class leftRotate{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] matrix = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            matrix[i] = sc.nextInt();
        }

       int temp=matrix[0];
       for (int i=0;i<n-1 ;i++ )
       {
        matrix[i]=matrix[i+1];
       } 

       matrix[n-1]=temp;

       for(int i=0;i<n;i++)
       {
        System.out.print(matrix[i]+" ");
       }

    }
}