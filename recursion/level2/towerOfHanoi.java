package level2;

public class towerOfHanoi {

    // n = number of disks
    // src = source rod
    // helper = auxiliary rod
    // dest = destination rod
    public static void towerOfHanoi(int n, String src, String helper, String dest) {

        // Base case: only one disk needs to be moved
        if (n == 1) {
            System.out.println(
                    "Move disk 1 from " + src + " to " + dest
            );
            return;
        }

        // Move n-1 disks from source to helper
        towerOfHanoi(n - 1, src, dest, helper);

        // Move the largest disk from source to destination
        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        // Move n-1 disks from helper to destination
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {

        // Start Tower of Hanoi with 2 disks
        // A = source, B = helper, C = destination
        towerOfHanoi(2, "A", "B", "C");
    }
}
