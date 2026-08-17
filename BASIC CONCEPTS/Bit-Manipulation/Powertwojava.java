import java.util.*;

public class Powertwojava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //logic to check if the number is power of 2 or not
        int oper=(n & (n-1));
        if(oper==0 && n>0)
        {
            System.out.print("Power of 2");
        }
        else{
            System.out.print("Not a power of 2");
        }
        
    }
}
