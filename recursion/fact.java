
public class fact {

    public static int getFact(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        //This is the main logic of getFact return the factorial of n by calling getFact recursively with n-1 and multiplying the result with n
        int fact = getFact(n - 1);
        return n * fact;     //or return n*getFact(n-1)

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(getFact(n));
    }
}
