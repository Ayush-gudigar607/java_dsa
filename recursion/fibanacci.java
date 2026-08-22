//This is the program to print the fibannaci sequence
package recursion;

public class fibanacci {

    public static void getFibannaciSequence(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        //Add the previous two numbers to get the next number in the sequence
        int c = a + b;
        System.out.println(c);
        //Call the function recursively with the next two numbers in the sequence and decrement n
        getFibannaciSequence(b, c, n - 1);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        //Call the function to print the fibannaci sequence starting from a and b and print n numbers in the sequence(n should be 5)
        getFibannaciSequence(a, b, n - 2);
    }
}
