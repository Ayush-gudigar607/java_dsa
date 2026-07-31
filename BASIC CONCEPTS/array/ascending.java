
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
