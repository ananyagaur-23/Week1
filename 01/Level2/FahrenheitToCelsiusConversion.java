import java.util.Scanner;

public class FahrenToCelsiusConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        float fahrenheit = input.nextFloat();

        float celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
    }
}
