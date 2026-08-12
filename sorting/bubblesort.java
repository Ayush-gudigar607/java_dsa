//This program is mainly worked on sorting technique named as bubblesort
public class bubblesort{
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
      //declaration of array element 
      int[] arr={7,8,3,1,2};

      //bubble short
      for(int i=0;i<arr.length-1;i++)
      {
        
        for(int j=0;j<arr.length-i-1;j++)
        {
           if(arr[j]>arr[j+1])
           {
            //swap
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
           }
        }
      }
      //call the printArray
      printArray(arr);

    }
}