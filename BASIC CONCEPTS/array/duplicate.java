import java.util.*;
import java.util.Arrays;

public class duplicate{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] matrix = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            matrix[i] = sc.nextInt();
        }

Arrays.sort(matrix);
System.out.print(matrix[0]+" ");
        for(int i=1;i<matrix.length;i++)
        {
          
            if(matrix[i]!=matrix[i-1])
            {
              System.out.print(matrix[i]+" ");
            }
            
  
          
        }

    }
}