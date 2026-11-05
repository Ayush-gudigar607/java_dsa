package seriesGenerator;

import java.util.Scanner;

public class multiseries {
    public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc=new Scanner(System.in);
      
      int a=sc.nextInt();
      int b=sc.nextInt();
    
      
      int currentTerm=a;

      
      
      for(int i=1;i<=b;i++)
      {
        System.out.print(currentTerm*i+" ");
      }
      

     
      }
}
