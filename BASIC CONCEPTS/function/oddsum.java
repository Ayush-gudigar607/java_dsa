import java.util.*;

public class oddsum {

  public static  void  oddSum(int n) {
    int sum=0;
    for(int i=1;i<=n*2;i++)
    {
      if(i%2!=0)
      {
   sum+=i;
      }
    }
    System.out.print("Sum of odd numbers:"+sum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    oddSum(n);    
  
  }
}
