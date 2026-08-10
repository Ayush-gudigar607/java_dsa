import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        
        for (int t = 0; t < q; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            int currentTerm = a;
            int powerOfTwo = 1;
            
            for (int i = 0; i < n; i++) {
                currentTerm += powerOfTwo * b;
                System.out.print(currentTerm + " ");
                powerOfTwo =powerOfTwo * 2;
            }
            System.out.println();
        }
        
    }
}