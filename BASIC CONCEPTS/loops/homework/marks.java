import java.util.Scanner;

public class marks {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int input;
        do
        {
        input=sc.nextInt();
         int marks=sc.nextInt();
         if(marks>=90)
         {
          System.out.println("This is Good");
         }
         else if(marks>=60 && marks<=89)
         {
            System.out.println("This is also good");
         }
         else if(marks>=0 && marks<=59)
         {
            System.out.println("This is Good as well");
         }
        }while(input==1);
    }
}
