import java.util.*;
public class maximun {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("comapre 4 numbers among it");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        int max=a;
        if(b>max)
        {
          max=b;
        }
        else if(c>max)
        {
          max=c;
        }
        else{
          max=d;
        }
        System.out.println(max + "is the maximum number");

    }
}
