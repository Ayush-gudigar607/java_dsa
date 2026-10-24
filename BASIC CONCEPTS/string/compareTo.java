
public class compareTo {
  public static void main(String[] args) {
    // if greter->positive value
    // if same->zero
    // if less->negative value

    String name1 = "tony";
    String name2 = "tony";
    if (name1.compareTo(name2) == 0) {
      System.out.print("Strings are equal");
    } else {
      System.out.print("Strings are not equal");
    }
  }
}
