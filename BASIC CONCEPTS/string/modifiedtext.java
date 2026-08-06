import java.util.*;

public class modifiedtext {
   public static void main(String args[]) {
       
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the text:");
      String originaltext=sc.next();

      String modifiedNumber=originaltext.replace('e','i');

      System.out.println("Modifed result:"+modifiedNumber);



      
      
   }
}
