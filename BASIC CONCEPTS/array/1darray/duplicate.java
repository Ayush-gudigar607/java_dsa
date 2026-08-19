//Program to remove duplicate elements from an array

import java.util.*;
import java.util.Arrays;

public class duplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] matrix = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            matrix[i] = sc.nextInt();
        }
        //sorting the array and printing the unique elements using Arrays.sort() method
        Arrays.sort(matrix);
        //printing the first element of the array
        System.out.print(matrix[0] + " ");
        for (int i = 1; i < matrix.length; i++) {
            //checking if the current element is not equal to the previous element, if not then print it
            if (matrix[i] != matrix[i - 1]) {
                System.out.print(matrix[i] + " ");
            }

        }

    }
}


//another method
// import java.util.Arrays;

// public class Main {
//     public static void duplicate(int[] numbers) {
//         Arrays.sort(numbers);

//         for (int i = 0; i < numbers.length; i++) {
//             if (i == 0 || numbers[i] != numbers[i - 1]) {
//                 System.out.print(numbers[i] + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] numbers = {4, 2, 2, 1, 4, 3};

//         duplicate(numbers);
//     }
// }
