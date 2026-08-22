package recursion;

public class naturalSum {

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.print(sum);
            return;
        }
        //sum to calculate the sum of all numbers from 1 to n and print it at the end of recursion
        sum += i;
        //recursive call to printSum with the next index and the updated sum
        printSum(i + 1, n, sum);
        // System.out.print(i); //used to print index 4 3 2 1
    }

    public static void main(String[] args) {
        int n = 5;
        printSum(1, n, 0);
    }
}
