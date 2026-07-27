import java.util.Scanner;

public class hallowbutterflynextpatter {
      public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of terms:");
      int n=sc.nextInt();
      //upper part
      for (int i=1;i<=n ;i++ ) 
      {
        for (int j=1;j<=i;j++) 
        {

          //1 st half
          if(j==1 || j==i || i==n)
          {
            System.out.print("*");
          }
          else 
          {
            System.out.print(" ");
          }
          
        }

        //Spaces
        for(int j=1;j<=2*(n-i);j++)
        {
          System.out.print(" ");
        }
        
        //2nd half
        for( int j=1;j<=i;j++)
        {
       if(j==1 || j==i || i==n)
       {
        System.out.print("*");
       }
       else{
        System.out.print(" ");
       }

        }
               System.out.println();

      }

      //lower part 
      for(int i=n;i>=1;i--)
      {
        for(int j=1;j<=i;j++)
        {
        if(j==1 ||j==i || i==n)
        {
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
        }

        for (int j=1;j<=2*(n-i);j++) 
        {
          System.out.print(" ");
        }
       for(int j=1;j<=i;j++)
        {
        if(j==1 ||j==i || i==n)
        {
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }


      }
              System.out.println();

    }
}
}
