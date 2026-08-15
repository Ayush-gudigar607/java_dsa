import java.util.Scanner;

public class countprime {
    public static int countPrimes(int n)
    {
        int count=0;
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(countPrimes(n));
    }
}
