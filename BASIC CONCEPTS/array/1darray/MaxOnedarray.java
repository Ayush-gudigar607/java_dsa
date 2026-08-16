//Program to find the maximum value in an array

import java.util.*;

public class MaxOnedarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number entered:");
        int number = sc.nextInt();

        int[] matrix = new int[number];

        System.out.println("Enter the values:");
//taking input of array from user
        for (int i = 0; i < number; i++) {
            matrix[i] = sc.nextInt();
        }
        //logic to find the maximum value in an array
        int max = matrix[0];

        //Output
        for (int i = 0; i < number; i++) {
            if (max < matrix[i]) {
                max = matrix[i];
            }
        }

        System.out.println("Maximum value to be in array:" + max);
    }
}
