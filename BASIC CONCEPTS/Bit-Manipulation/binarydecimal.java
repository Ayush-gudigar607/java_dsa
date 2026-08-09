import java.util.*;

public class binarydecimal
{
    public static int decimalToBinary(int n)
    {
        int binary=0;
        int place=1;

        while(n>0)
        {
            int rem=n%2;
            binary=binary+(rem*place);
            place=place*10;
            n=n/2;
        }
        return binary;
    }
    public static int binaryToDecimal(int binary)
    {
        int decimal=0;
        int power=1;

        while(binary>0)
        {
            int digit=binary%10;
            decimal=decimal+(digit*power);
            power=power*2;
            binary=binary/10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(decimalToBinary(n));
        System.out.print(binaryToDecimal(n));
    }
}