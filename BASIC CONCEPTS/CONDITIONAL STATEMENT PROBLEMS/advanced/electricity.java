import java.util.Scanner;
public class electricity {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter charge per unit: ");
        float chargePerUnit = sc.nextFloat();

        System.out.print("Enter total units consumed: ");
        float units = sc.nextFloat();

        if (units >= 0 && chargePerUnit >= 0) {
            float total = chargePerUnit * units;
            System.out.printf("Total Bill: RS %.2f\n", total);
        } else {
            System.out.println("Invalid input: Units and charges cannot be negative.");
        }

    }   
}
