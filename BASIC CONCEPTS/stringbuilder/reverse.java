//reverse the string using the stringbuilder with front and back method

public class reverse {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony Stark");

        for (int i = 0; i < sb.length() / 2; i++) {  
            //intialize the front and back index
            int front = i;
            int back = sb.length() - 1 - i;

            //get the character at front and back index
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            //set the character at front and back index
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        //print the reversed string
        System.out.println(sb);
    }
}
