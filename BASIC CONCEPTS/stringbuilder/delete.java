//this is the code where we can delete the string in the stringbuilder class
public class delete {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.delete(0, 2);
        System.out.println(sb);
    }
}
