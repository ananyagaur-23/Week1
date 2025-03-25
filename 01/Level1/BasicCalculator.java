import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float number1 = input.nextFloat();

        System.out.print("Enter second number: ");
        float number2 = input.nextFloat();

        float additionResult = number1 + number2;
        float subtractionResult = number1 - number2;
        float multiplicationResult = number1 * number2;
        float divisionResult = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is:");
        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
    }
}