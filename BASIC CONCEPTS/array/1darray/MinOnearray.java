//Program to find the minimum value in an array

import java.util.*;

public class MinOnearray {

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
//logic to find the minimum value in an array
        int min = matrix[0];

        //Output
        for (int i = 0; i < number; i++) {
            //logic to find the minimum value in an array
            if (min > matrix[i]) {
                min = matrix[i];
            }
        }

        System.out.println("Minimum value to be in array:" + min);
    }
}
