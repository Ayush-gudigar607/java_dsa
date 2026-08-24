
// public class recursion2 {

//     public static void printNumber(int n) {
//         if (n == 6) {
//             return;
//         }
//         System.out.print(n + " ");
//         printNumber(n + 1);

//     }

//     public static void main(String[] args) {
//         int n = 1;
//         printNumber(n); //n=1

//     }
// }

package level1;

public class recursion2{
  public static void printNumber(int i,int n)
  {
    if(i==n)
    { System.out.print(i);
      return;
    }

    System.out.print(i+" ");
    printNumber(i+1,n);
  }
  

  public static void main(String[] args)
  {
    printNumber(1,6);
  }
}


