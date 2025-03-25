import java.util.Scanner;

public class CelsiusToFahrenheitConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float celsius = input.nextFloat();

        float fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
    }
}
