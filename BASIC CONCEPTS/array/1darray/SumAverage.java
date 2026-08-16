//Program to find the sum and average of an array
import java.util.*;

public class SumAverage { // 1. Removed invalid parentheses from class name

    public static int calculateSum(int[] matrix) { 
        int sum = 0;
        // 2. Fixed the loop to iterate through the array correctly
        for (int i = 0; i < matrix.length; i++) { 
            sum += matrix[i]; // 4. Added missing semicolon
        } 
        System.out.println("Sum of the numbers is: " + sum);
        return sum; 
    }

    public static void average(int sum, int length) {
        System.out.println("Average is: " + ((double) sum / length)); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(String.class.cast(System.in));
        System.out.print("Enter the number of elements: ");
        int numbers = sc.nextInt();

        int[] matrix = new int[numbers];
        System.out.println("Enter the elements:");
        // 7. Fixed the loop to iterate through the array correctly
        for (int i = 0; i < numbers; i++) {
            matrix[i] = sc.nextInt(); // 8. Fixed storing inputs into 'matrix', not 'numbers'
        } 
// 9. Fixed the method calls to pass correct parameters
        int totalSum = calculateSum(matrix); 
        average(totalSum, numbers); 
    }
}
