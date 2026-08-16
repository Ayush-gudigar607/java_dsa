//Program to take input of an array from user and print the array
import java.util.*;

public class arrayinputoutput {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];
//input array
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
//output array
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
