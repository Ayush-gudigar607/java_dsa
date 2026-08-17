//this is the code where we can delete the string in the stringbuilder class

public class delete {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        //delete the string in the stringbuilder class
        sb.delete(0, 2);
        System.out.println(sb);
    }
}
