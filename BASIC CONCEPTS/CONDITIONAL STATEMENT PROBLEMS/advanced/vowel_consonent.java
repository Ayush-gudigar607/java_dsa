import java.util.Scanner;

public class vowel_consonent {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);

      char lowercase=Character.toLowerCase(ch);

      if(!Character.isLetter(lowercase))
      {
        System.out.println("Error while entering the values");
      }

      if(lowercase=='a' || lowercase=='e' || lowercase=='i' || lowercase=='o' || lowercase=='u')
      {
        System.out.println("vowel");
      }
      else{
        System.out.println("consonants");
      }

    }
}
