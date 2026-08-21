public class SortedArray {

    public static boolean ascending(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] >= arr[index + 1]) {
            return false;
        }

        return ascending(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println(ascending(arr, 0));
    }
}