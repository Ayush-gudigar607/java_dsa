// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age :");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("Person is eligible to vote");
        }
        else
        {
            System.out.println("person is Not Eligible to vote");
        }
    }
}