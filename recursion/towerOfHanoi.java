
public class towerOfHanoi {
//n is number of disks, src is source rod, helper is auxiliary rod and dest is destination rod

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }
        
        //move n-1 disks from source to helper using destination as auxiliary
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);

    }

    public static void main(String args[]) {
        towerOfHanoi(2, "A", "B", "C");
    }
}
