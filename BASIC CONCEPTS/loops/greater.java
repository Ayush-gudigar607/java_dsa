
import java.util.Scanner;

class greater
{
	public static void main (String[] args) throws java.lang.Exception
	{
      //greater of many numbers
      
      Scanner sc=new Scanner(System.in);
      
      //number of values to be entered
      int n=sc.nextInt();
      
      //first value taken as max
      int max=sc.nextInt();
      
      for(int i=1;i<n;i++)
      {
          int current=sc.nextInt();
          
          if(current>max)
          {
              max=current;
          }
      }
      
      System.out.print(max);
	}
}
