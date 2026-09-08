//THIS IS THE PROGRAM FOR LARGESTOFTHREE NUMBERS

import java.util.*;

public class largestthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second Number:");
        int b=sc.nextInt();
        System.out.println("Enter the third Number:");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a is greater number");
        }
        else if(b>c)
        {
            System.out.println("b is greater number");
        }
        else
        {
            System.out.println("c is greater number");
        }
    }
}

//using third variable to store the largest number

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n1=sc.nextInt();
//        int n2=sc.nextInt();
//        int n3=sc.nextInt();

//        int max=n1;
       
//        if(n2>max)
//        {
//         max=n2;
//        }
//        if(n3>max)
//        {
//         max=n3;
//        }
       
//        System.out.println(max+"is the maximum number");
       
//     }
// }

