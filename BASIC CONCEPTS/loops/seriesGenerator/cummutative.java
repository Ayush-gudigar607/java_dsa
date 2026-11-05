package seriesGenerator;

import java.util.Scanner;

public class cummutative {
    public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc=new Scanner(System.in);
      
      int a=sc.nextInt();
      int b=sc.nextInt();
      int n=sc.nextInt();
      
      int currentvalue=a;

      
      for (int i=1;i<=n ;i++ )
      {
          currentvalue=currentvalue+b;
          System.out.print(currentvalue+" ");
          b=b+1;
      }
     
     
      }
}
