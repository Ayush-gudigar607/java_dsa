package recursion;

public class naturalSum {

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.print(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
        // System.out.print(i); //used to print index 4 3 2 1
    }

    public static void main(String[] args) {
        int n = 5;
        printSum(1, n, 0);
    }
}
