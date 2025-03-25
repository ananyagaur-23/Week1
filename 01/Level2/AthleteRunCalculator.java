import java.util.Scanner;

public class AthleteRunCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1 of the triangle (in meters): ");
        float side1 = input.nextFloat();

        System.out.print("Enter side2 of the triangle (in meters): ");
        float side2 = input.nextFloat();

        System.out.print("Enter side3 of the triangle (in meters): ");
        float side3 = input.nextFloat();

        float perimeter = side1 + side2 + side3;

        float totalDistance = 5000; // 5 km in meters
        float numberOfRounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km");
    }
}
