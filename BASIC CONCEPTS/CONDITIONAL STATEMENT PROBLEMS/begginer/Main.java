//THIS IS FOR POSITIVE AND NEGATIVE NUMBER USING CONDITIONAL STATEMENT
import java.util.*;
 public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Negative number:");
        int n=sc.nextInt();
        if(n%2!=0)
        {
            
            System.out.println("Negative Number\n");
        }
        else
        {
         System.out.println("Not a Negative number");

        }
    }
}