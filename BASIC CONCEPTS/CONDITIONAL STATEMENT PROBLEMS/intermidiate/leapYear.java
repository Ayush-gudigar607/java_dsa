import java.util.*;

public class leapYear {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int year=sc.nextInt();

       if((year%400==0) || ((year%4==0) && (year%100!=0)))
       {
        System.out.print(year+" Is Leap year");
       }
       else{
        System.out.print( year+" Not a Leap Year");
       }
       
    }
}
