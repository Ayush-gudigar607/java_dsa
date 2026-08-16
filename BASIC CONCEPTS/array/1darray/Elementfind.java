//Program to find the index of an element in an array

import java.util.*;

public class Elementfind {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        //taking input of array from user
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number want to search it from the Given array:");
        //taking input of the number to be searched from user
        int searchNumber = sc.nextInt();

//logic to find the index of the number in the array
        for (int i = 0; i < size; i++) {
            if (numbers[i] == searchNumber) {
                System.out.println("The index of the number is " + i);
            }

        }

    }
}

// import java.util.*;
// public class arratinput {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of the array:");
//         int numbers[]=new int[5];
//         for (int i=0;i<numbers.length;i++ )
//         {
//           numbers[i]=sc.nextInt();
//         } 
//         System.out.println("Enter the number want to search it from the Given array:");
//         int searchNumber=sc.nextInt();
//         for(int i=0;i<numbers.length;i++)
//         {
//           if(numbers[i]==searchNumber)
//           {
//             System.out.println("The index of the number is "+i);
//           }
//         }
// }
// }
