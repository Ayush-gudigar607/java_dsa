package seriesGenerator;

import java.util.Scanner;

public class poweroftwo {
    	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc=new Scanner(System.in);
      
      int n=sc.nextInt();
      
      int poweroff=1;

      for (int i=1;i<=n ;i++ )
      {
          System.out.print(poweroff);

          poweroff=poweroff*2;
      }
      

     
      }
}
