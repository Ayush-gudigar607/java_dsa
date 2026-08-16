import java.util.*;

public class lcm{
  public static void lcmvalue(int n1,int n2)
  {
   int lcm=Math.max(n1,n2);

   while(true)
   {
    if(lcm%n1==0 && lcm%n2==0)
    {
      break;
    }
    lcm++;
   }

   System.out.print("LCM OF "+n1+" and "+n2+" is: "+lcm);
  }

  public static void main(String[] args)
  {
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
lcmvalue(n1,n2);
  }
}