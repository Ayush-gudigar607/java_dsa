//This is an implementation of insertion sort in java
public class InsertionSort {
  //function to print the array element
  public static void printArray(int arr[])
  {
    for (int i=0;i<arr.length ;i++ )
    {
      System.out.print(arr[i]+" ");
    } 
    System.out.println();
  }
    public static void main(String[] args) {
      int arr[]={7,8,3,1,2};

      //insertion sort(time complexity is O(n^2))
      for(int i=1;i<arr.length;i++)
      {
        //current element
        int current=arr[i];
        //previous element
        int j=i-1;

        while(j>=0 && current<arr[j])
        {
          //shift the element
         arr[j+1]=arr[j];
         j--;
        }

        //placement
        arr[j+1]=current;

      }
      printArray(arr);
    }
}