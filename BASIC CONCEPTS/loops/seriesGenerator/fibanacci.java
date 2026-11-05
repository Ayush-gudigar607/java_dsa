package seriesGenerator;

import java.util.Scanner;

public class fibanacci {
    	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc=new Scanner(System.in);
      
      int n=sc.nextInt();
      
      int t1=0;
      
      int t2=1;
      System.out.print(t1+" "+t2+" ");
      
      int c=0;
      
      for (int i=1;i<=n-2;i++)
      {
          c=t1+t2;
          System.out.print(c+" ");
          t1=t2;
          t2=c;
      }
      

     
      }
}
