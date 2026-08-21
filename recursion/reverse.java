import java.util.*;

public class reverse{
    public static void reverseString(String str,int index){
        
        if(index<0)
        {
            return;
        }

        System.out.print(str.charAt(index));
        reverseString(str,index-1);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
        String str=sc.nextLine();
        reverseString(str,str.length()-1);

    }
}