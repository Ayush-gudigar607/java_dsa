

public class charAt {
    public static void main(String[] args)
    {
      String firstname="Hello";
      String lastname="Boss";
      String fullName=firstname+lastname;
      for (int i=0;i<fullName.length() ;i++ )
      {
        //operation for charAt() method to get the character at a specific index
        System.out.println(fullName.charAt(i));
      } 
    }
}
