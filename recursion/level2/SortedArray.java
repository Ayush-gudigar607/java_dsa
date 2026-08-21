package level2;

public class SortedArray {

    public static boolean ascending(int[] arr, int index) {
        //base case if index is equal to the length of the array then return true
        if (index == arr.length - 1) {
            return true;
        }
        //condition to check if the current element is greater than or equal to the next element then return false
        if (arr[index] >= arr[index + 1]) {
            return false;
        }
       //recursive call for ascending
        return ascending(arr, index + 1);
    }

    public static void main(String[] args) {
        //test case for ascending
        int[] arr = {1, 2, 3};
        //function call for ascending
        System.out.println(ascending(arr, 0));
    }
}
