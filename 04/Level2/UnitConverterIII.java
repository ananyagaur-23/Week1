import java.util.Scanner;

public class UnitConverterIII {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to convert: ");
        double value = sc.nextDouble();

        System.out.print("Enter conversion type (e.g. fToC, cToF, poundsToKg, kgToPounds, gallonsToLiters, litersToGallons): ");
        String conversionType = sc.next();

        double result;
        switch (conversionType) {
            case "fToC":
                result = convertFahrenheitToCelsius(value);
                System.out.println(value + " Fahrenheit = " + result + " Celsius");
                break;
            case "cToF":
                result = convertCelsiusToFahrenheit(value);
                System.out.println(value + " Celsius = " + result + " Fahrenheit");
                break;
            case "poundsToKg":
                result = convertPoundsToKilograms(value);
                System.out.println(value + " Pounds = " + result + " Kilograms");
                break;
            case "kgToPounds":
                result = convertKilogramsToPounds(value);
                System.out.println(value + " Kilograms = " + result + " Pounds");
                break;
            case "gallonsToLiters":
                result = convertGallonsToLiters(value);
                System.out.println(value + " Gallons = " + result + " Liters");
                break;
            case "litersToGallons":
                result = convertLitersToGallons(value);
                System.out.println(value + " Liters = " + result + " Gallons");
                break;
            default:
                System.out.println("Invalid conversion type!");
        }

        sc.close();
    }
}
