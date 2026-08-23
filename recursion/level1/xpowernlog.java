package level1;

public class xpowernlog {

    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }
        // int xPownm1 = calPower(x, n - 1);
        // int xPown = x * xPownm1;
        // return xPown;
        if (n % 2 == 0) {
            return calPower(x, n / 2) * calPower(x, n / 2);
        } else { //n is odd
            return calPower(x, n / 2) * calPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
