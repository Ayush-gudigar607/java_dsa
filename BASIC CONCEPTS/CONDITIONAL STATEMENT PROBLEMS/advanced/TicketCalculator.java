
import java.util.*;

public class TicketCalculator{
    public static void main(String[] args)
    {
        System.out.println("Enter the age of the person");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        double ticketPrice=0.0;
        int basePrice=200;

         if(age<12)
         {
            ticketPrice=basePrice*0.5;
            System.out.println("Child discount applied");
         }
         else if(age>=60)
         {
            ticketPrice=basePrice*0.6;
            System.out.println("Senior citizen discount applied");
         }
         else
         {
            ticketPrice=basePrice;
            System.out.println("No discount applied");
         }

         System.out.println("The ticket price is: " + ticketPrice);
    }
}