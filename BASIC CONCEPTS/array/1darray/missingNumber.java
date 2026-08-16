//Program to find the missing number in an array

import java.util.*;

public class missingNumber {

    public static int gettingMissingNumber(int[] arr, int n) {
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        // Calculate the actual sum of the elements in the array
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
// The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read the maximum value N
        int n = sc.nextInt();

        // 2. Initialize the array with size N - 1 (since one number is missing)
        int[] arr = new int[n - 1];

        // 3. Read the array elements from the user
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // 4. Calculate and print the result
        System.out.println("Missing Number: " + gettingMissingNumber(arr, n));

    }
}
