    import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int reversed=0;
        int temp=n;
        while(n>0)
        {
            reversed=reversed * 10+n % 10;
            n=n/10;
        }
       System.out.println(temp==reversed);
        
    }
}

