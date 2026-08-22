package recursion;


/*   Traditional method print the array values */
// public class recursion {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n;i>=1;i--)
//         {
//             System.out.print(i+" ");
//         }
//     }
// }

/*   Recursion method print the array values */
public class recursion {

    public static void printNumber(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n + " ");
            //recursive call to printNumber with n-1
            printNumber(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printNumber(n);
    }
}
