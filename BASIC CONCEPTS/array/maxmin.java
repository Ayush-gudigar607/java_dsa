import java.util.*;

public class maxmin {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        // int numbers[]={10,20,30,40,50};
        int numbers[]=new int[size];

       

        for(int i=0;i<numbers.length;i++)
        {
           numbers[i]=sc.nextInt();
        }

        int min=numbers[0];
        int max=numbers[0];

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]<min)
            {
                min=numbers[i];
            }

            if(numbers[i]>max)
            {
                max=numbers[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
