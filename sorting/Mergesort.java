public class Mergesort  {

    public static void conquer(int arr[],int si,int mid,int ei)
    {
        int merger[]=new int[ei-si+1];

        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=ei)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merger[x++]=arr[idx1++];
                // x++;
                // idx1++;
            }
            else
            {
                merger[x++]=arr[idx2++];
            }
        }

        // Copy any remaining elements from the left subarray
        while(idx1<=mid)
        {
            merger[x++]=arr[idx1++];
        }

        // Copy any remaining elements from the right subarray
        while(idx2<=ei)
        {
            merger[x++]=arr[idx2++];
        }

        // Copy the merged array back to the original array
        for(int i=0,j=si;i<merger.length;i++,j++)
        {
            arr[j]=merger[i];
        }
    }

    public static void divide(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
      int mid=si+(ei-si)/2; //or int mid=(si+ei)/2;
      divide(arr,si,mid);
      divide(arr,mid+1,ei);
      
      conquer(arr,si,mid,ei);

    }
    public static void main(String[] args)
    {
      int arr[] = {5, 2, 8, 1, 9};
      int n=arr.length;
      divide(arr,0,n-1);

      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
      }

    }
}
