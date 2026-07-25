// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class greatesttwono {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second Number:");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater number");
        }
        else if(a==b)
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("b is greater number");
        }
    }
}