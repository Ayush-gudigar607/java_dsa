//Add the insert value in the stringbuilder class

public class insertvalue {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        //insert the string in the stringbuilder class
        sb.insert(0, "m");
        System.out.println(sb);
    }
}
