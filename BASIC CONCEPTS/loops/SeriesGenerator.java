//This code is a solution to a problem that involves generating a series of numbers based on given inputs. The program reads an integer `q` which represents the number of queries. For each query, it reads three integers: `a`, `b`, and `n`.

import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //no of queries
        int q = sc.nextInt();
        
        //loop through each query
        for (int t = 0; t < q; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            //current term starts with a and powerOfTwo starts with 1
            int currentTerm = a;
            //poweroftwo value
            int powerOfTwo = 1;
            
            //loop through n terms to generate the series
            for (int i = 0; i < n; i++) {
                currentTerm = currentTerm+powerOfTwo * b;
                System.out.print(currentTerm + " ");
                powerOfTwo =powerOfTwo * 2;
            }
            System.out.println();
        }
    }
}