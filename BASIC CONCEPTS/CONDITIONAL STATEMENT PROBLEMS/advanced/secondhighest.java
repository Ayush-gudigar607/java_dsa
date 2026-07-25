import java.util.*;
public class secondhighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int secondmax;

     if(a>=b && a>=c)
     {
      if( b>=c)
      {
      secondmax=b;
      }
      else{
        secondmax=c;
      }
     }
     else if(b>=a && b>=c)
     {
      if(a>=c) secondmax=a;
      else secondmax=c;
     }
     else
     {
      if(a>=b) secondmax=a;
      else secondmax=b;
     }

        System.out.println(secondmax + " is the second highest number");

    }
}
