// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.

import java.util.Scanner;


public class ascending {
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int numbers[]=new int[size];

    for(int i=0;i<numbers.length;i++)
    {
        numbers[i]=sc.nextInt();
    }
    boolean isascending=false;
    for(int i=0;i<numbers.length-1;i++)
    { // i already get the 4 value in ex i=4 when i<numbers.length in below numbers[5] becomes it 
        if(numbers[i]<numbers[i+1])
        {
isascending=false;
        }
    }

    if(isascending)
    {
        System.out.println("Ascending order");
    }
    else
    {
        System.out.println("decending order");
    }

 }   
}




// import java.util.Scanner;
// import java.util.Arrays;


// public class ascending {
//  public static void main(String args[])
//  {
//     Scanner sc=new Scanner(System.in);
//     int size=sc.nextInt();
//     int numbers[]=new int[size];

//     for(int i=0;i<numbers.length;i++)
//     {
//         numbers[i]=sc.nextInt();
//     }

//     Arrays.sort(numbers);
   
    

//     for(int i=0;i<numbers.length;i++)
//     {
//       System.out.println(numbers[i]);
//     }

   

//  }   
// }

