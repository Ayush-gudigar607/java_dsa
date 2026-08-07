public class declrationofstringbuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony Stark");
        System.out.print(sb);

        // Character at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);

         sb.setCharAt(0,'t');
        System.out.println(sb);

        sb.insert(0,'S');
        System.out.println(sb);
//insert the values
        sb.insert(3,'n');
        System.out.println(sb);

        //delete the Index(only delete index 2)
        sb.delete(2,3);
        System.out.print(sb);

        //append 
        sb.append("a");
        sb.append("b");
        System.out.print(sb);

        System.out.print(sb.length());




    }
}