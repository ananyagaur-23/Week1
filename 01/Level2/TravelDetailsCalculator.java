import java.util.Scanner;

public class TravelDetailsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = input.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = input.nextLine();

        System.out.print("Enter To City: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        int fromToVia = input.nextInt();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        int viaToFinalCity = input.nextInt();

        System.out.print("Enter time taken for the full journey (in hours): ");
        float timeTaken = input.nextFloat();

        int totalDistance = fromToVia + viaToFinalCity;

        System.out.println("\nHello " + name + "!");
        System.out.println("Your travel route is from " + fromCity + " → " + viaCity + " → " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time Taken: " + timeTaken + " hours");

        System.out.print("\nEnter fee amount: ");
        int fee = input.nextInt();

        System.out.print("Enter discount percent: ");
        int discountPercent = input.nextInt();

        int discountAmount = fee * discountPercent / 100;
        int amountAfterDiscount = fee - discountAmount;
        int doubledFinalAmount = amountAfterDiscount * 2 + 10;

        System.out.println("\nThe results of Int Operations are " + discountAmount + ", " + amountAfterDiscount + ", and " + doubledFinalAmount);
    }
}
