//This is the program for selection sort 
public class selection {
//program to print the aeray
  public static void printArray(int arr[])
  {
    for (int i=0;i<arr.length-1 ;i++ ) 
    {
      System.out.print(arr[i]);
    }
    System.out.println();
  }
    public static void main(String[] args) {
      int arr[]={7,8,3,1,2};

      //selection sort(time complexity=O(n^2))
      //logic for working selection sort inside inner loop 
      for (int i=0;i<arr.length-1 ;i++ )
      {
        int smallest=i;
        for (int j=i+1;j<arr.length ;j++ )
        {
           if(arr[smallest]>arr[j])
           {
            smallest=j;
           }
        }
     //By using index assign the value to temp then that element will swap the position 
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;

      } 

      printArray(arr);
}
}