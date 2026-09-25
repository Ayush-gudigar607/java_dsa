import java.util.Scanner;

public class income_tax {
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      double income=sc.nextFloat();
      double tax=0;

      if( income>10000  && income<=50000)
      {
         tax=income*0.02;
        System.out.println("Tax:"+tax);

      }
      else if(income>50000 && income>100000)
      {
         tax=income*0.05;
        System.out.println("Tax:"+tax);
      }
      else{
         tax=income*0.01;
        System.out.println("Tax"+tax);
      }
    }
}
