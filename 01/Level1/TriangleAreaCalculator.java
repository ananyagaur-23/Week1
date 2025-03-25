import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in inches): ");
        float base = input.nextFloat();

        System.out.print("Enter the height of the triangle (in inches): ");
        float height = input.nextFloat();

        float areaInSquareInches = 0.5f * base * height;

        float baseInCentimeters = base * 2.54f;
        float heightInCentimeters = height * 2.54f;
        float areaInSquareCentimeters = 0.5f * baseInCentimeters * heightInCentimeters;

        System.out.println("Area of the triangle:");
        System.out.println("In square inches: " + areaInSquareInches);
        System.out.println("In square centimeters: " + areaInSquareCentimeters);
    }
}
