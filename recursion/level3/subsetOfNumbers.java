package level3;
import java.util.ArrayList;

public class subsetOfNumbers{

   public static void printSubsets(ArrayList<Integer> subset) {
       for(int i=0;i<subset.size();i++)
       {
           System.out.print(subset.get(i)+" ");
       }
       System.out.println();

    }
    {
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findSubsets(n,subset);
    }
    public static void findSubsets(int n,ArrayList<Integer> subset)
    {
        //Base case
        if(n==0)
        {
            System.out.println(subset);
            return;
        }

         //add the subset to the list of subsets
         subset.add(n); 
         findSubsets(n-1,subset);

         //No add the subset to the list of subsets
         subset.remove(subset.size() - 1); //remove the last index which we gona stored.
         findSubsets(n-1,subset);
    }
    public static void main(String[] args)
    {
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findSubsets(n,subset);
    }
}
