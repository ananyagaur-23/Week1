import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        float principal = input.nextFloat();

        System.out.print("Enter the Rate of Interest: ");
        float rate = input.nextFloat();

        System.out.print("Enter the Time (in years): ");
        float time = input.nextFloat();

        float simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}
