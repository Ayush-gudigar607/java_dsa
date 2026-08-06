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


// public class modifiedtext {
//    public static void main(String args[]) {
       
//       Scanner sc=new Scanner(System.in);
//       System.out.print("Enter the text:");
//       String originaltext=sc.next();

//       char[] chars=originaltext.toCharArray();

//       for(int i=0;i<chars.length;i++)
//       {
//         if(chars[i]=='e')
//         {
//           chars[i]='i';
//         }
//       }

//       String modifiedtext=new String(chars);
//       System.out.println(modifiedtext);
   //    }
// }

// import java.util.*;

// public class modifiedtext {
//    public static void main(String args[]) {
       
//       Scanner sc=new Scanner(System.in);
//       System.out.print("Enter the text:");
//       String str=sc.next();
//       String result="";

//       for (int i=0;i<str.length();i++ )
//       {
//         if(str.charAt(i)=='e')
//         {
//           result+='i';
//         }
//         else{
//           result+=str.charAt(i);
//         }
//       }

//       System.out.println(result); 
 
//    }
// }


