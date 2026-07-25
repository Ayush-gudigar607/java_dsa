import java.util.*;
public class traingle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three sides:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("This is not a triangle");
        } else if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || c == a) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

        
    }
}

