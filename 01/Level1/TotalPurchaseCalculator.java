import java.util.Scanner;

public class TotalPurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price (INR): ");
        float unitPrice = input.nextFloat();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        float totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
