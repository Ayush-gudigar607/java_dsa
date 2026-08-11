import java.util.*;

public class  LCMS{
  
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n1=sc.nextInt();
  int n2=sc.nextInt();
  int lcm;

  int start=Math.max(n1,n2);

  for(int i=start; ;i++)
  {
    if(i%n1==0 && i%n2==0)
    {
      lcm=i;
      break;
    }
  }
  System.out.print("LCM OF "+  n1 +" and "+n2+" IS:"+  lcm);
}
}