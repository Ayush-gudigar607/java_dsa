import java.util.*;

public class AscendingArray {

  public static void Ascending(int length)
  {

    Scanner sc=new Scanner(System.in);
    int arr[]=new int[length];

      for (int i=0;i<length ;i++ )
      {
        arr[i]=sc.nextInt();
      } 

      boolean isAscending=true;

      for (int i=0;i<length-1 ;i++ )
      {
        if(arr[i]>arr[i+1])
        {
          isAscending=false;

        }
      }

      System.out.print(isAscending);
  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int length=sc.nextInt();

      Ascending(length);
       

      
    }
}