// import java.util.*;
// public class vocons {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         char ch=sc.next().charAt(0);
//         if((ch =='a') || (ch =='e') || (ch =='i') || (ch =='o') || (ch =='u'))
//         {
//             System.out.println(ch + "is Vowel");
//         }
//         else
//         {
//             System.out.println(ch + "is consonants");
//         }
        
//     }
// }

//THIS IS THE PROGRAM TO CHECK WHETHER A CHARACTER IS VOWEL OR CONSONANTS
import java.util.*;

public class vocons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ch=sc.next();
        if(((ch.equals('a'))) || ((ch.equals('e'))) || ((ch.equals('i'))) || ((ch.equals('o'))) || ((ch.equals('u'))))
        {
            System.out.println(ch + "is Vowel");
        }
        else
        {
            System.out.println(ch + "is consonants");
        }
        
    }
}


