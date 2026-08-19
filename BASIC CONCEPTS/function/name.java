//Add the code to print your name using a function. The function should take your name as an argument and print it in the format "My name is: <your_name>".

import java.util.*;

public class name {

    public static void printMyname(String name) {
        System.out.print("My name is:" + name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printMyname(str);
    }
}
