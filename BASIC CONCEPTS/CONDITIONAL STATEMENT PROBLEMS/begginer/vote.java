//this is the program to check whether a person is eligible to vote or not using conditional statements
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