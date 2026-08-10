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
