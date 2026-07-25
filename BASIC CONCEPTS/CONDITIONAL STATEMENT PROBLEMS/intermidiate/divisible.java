import java.util.*;

public class divisible {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0 && n%11==0)
        {
          System.out.println(n+" is divisible by 5 and 11");
        }
        else if(n%5==0)
        {
          System.out.println(n +" is divisible by 5");
        }
        else if(n%11==0)
        {
          System.out.println(n + " is divisble by 11");
        }
        else
        {
          System.out.println(n + " is not divisible by 5 and 11");
        }
    }
}
