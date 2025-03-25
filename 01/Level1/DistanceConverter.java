import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        float distanceInFeet = input.nextFloat();

        float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance of " + distanceInFeet + " feet is:");
        System.out.println("In yards: " + distanceInYards);
        System.out.println("In miles: " + distanceInMiles);
    }
}
