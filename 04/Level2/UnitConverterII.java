import java.util.Scanner;

public class UnitConverterII {
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();

        System.out.print("Enter conversion type (yardsToFeet, feetToYards, metersToInches, inchesToMeters, inchesToCentimeters): ");
        String conversion = sc.next();

        if (conversion.equals("yardsToFeet")) {
            System.out.println("\n" + value + " yards = " + convertYardsToFeet(value) + " feet");
        } else if (conversion.equals("feetToYards")) {
            System.out.println("\n" + value + " feet = " + convertFeetToYards(value) + " yards");
        } else if (conversion.equals("metersToInches")) {
            System.out.println("\n" + value + " meters = " + convertMetersToInches(value) + " inches");
        } else if (conversion.equals("inchesToMeters")) {
            System.out.println("\n" + value + " inches = " + convertInchesToMeters(value) + " meters");
        } else if (conversion.equals("inchesToCentimeters")) {
            System.out.println("\n" + value + " inches = " + convertInchesToCentimeters(value) + " centimeters");
        } else {
            System.out.println("\nInvalid conversion type!");
        }

        sc.close();
    }
}
