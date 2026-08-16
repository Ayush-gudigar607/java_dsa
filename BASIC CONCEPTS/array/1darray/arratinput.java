//Program to take input of an array from user

import java.util.*;

public class arratinput {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //taking input of array from user
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number at index " + i);
            numbers[i] = sc.nextInt();
        }
    }
}
