
public class fact {

    public static int getFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = getFact(n - 1);
        return n * fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(getFact(n));
    }
}
