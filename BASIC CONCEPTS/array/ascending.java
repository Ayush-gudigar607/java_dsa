import java.util.Scanner;

public class ascending {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // 1. Assume the array is ascending initially
        boolean isascending = true; 

        for (int i = 0; i < numbers.length - 1; i++) { 
            // 2. If a left item is GREATER than a right item, it's not ascending
            if (numbers[i] > numbers[i + 1]) {
                isascending = false;
                break; // No need to check further
            }
        }

        // 3. Print the final result
        if (isascending) {
            System.out.println("Ascending order");
        } else {
            System.out.println("Not ascending order"); 
        }
        
       
    }   
}




// import java.util.Scanner;
// import java.util.Arrays;


// public class ascending {
//  public static void main(String args[])
//  {
//     Scanner sc=new Scanner(System.in);
//     int size=sc.nextInt();
//     int numbers[]=new int[size];

//     for(int i=0;i<numbers.length;i++)
//     {
//         numbers[i]=sc.nextInt();
//     }

//     Arrays.sort(numbers);
   
    

//     for(int i=0;i<numbers.length;i++)
//     {
//       System.out.println(numbers[i]);
//     }

   

//  }   
// }

