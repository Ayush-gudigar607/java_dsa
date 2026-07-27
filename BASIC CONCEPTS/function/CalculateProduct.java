import java.util.*;
public class CalculateProduct {
   public static int CalculateProduct(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the one number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("The final result is:");
        
        System.out.println(CalculateProduct(a,b));
    }  
}
