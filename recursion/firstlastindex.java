
public class firstlastindex {

    static int first = -1;
    static int last = -1;

    public static void firstLastIndex(String str, char ele, int index) {
        //base case index is equal to the length of the string then return
        if (index == str.length()) {
            return;
        }
        //if first element is found then store the index in first and if last element is found then store the index in last
        if (str.charAt(index) == ele) {

            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        //recursive call for firstLastIndex
        firstLastIndex(str, ele, index + 1);
    }

    public static void main(String args[]) {
        String str = "abcaacd";
        char ele = 'a';
        //function call for firstLastIndex
        firstLastIndex(str, ele, 0);
        // System.out.println("First index: " + str.charAt(first));
        // System.out.println("Last index: " + str.charAt(last));
        System.out.println("First index: " + first);
        System.out.println("Last index: " + last);

    }
}
