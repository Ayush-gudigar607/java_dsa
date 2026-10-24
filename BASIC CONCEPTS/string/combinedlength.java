import java.util.*;

public class combinedlength {
   public static void main(String args[]) {
       
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      String[] array=new String[size];
      int totalLength=0;

      for (int i=0;i<size ;i++ )
      {
        //used to find the total length of the string
        array[i]=sc.next();
        totalLength+=array[i].length();
      } 
      //print the totallength of the string
      System.out.print("The total length is:"+totalLength);

      
      
   }
}
