//this code mainly for set the character in the stringbuilder class
public class setchar {
    public static void main(String[] main)
    {
        StringBuilder sb=new StringBuilder("hello");
        //set the character in the stringbuilder class
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}
