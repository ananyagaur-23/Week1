import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter salary (INR): ");
        float salary = input.nextFloat();

        System.out.print("Enter bonus (INR): ");
        float bonus = input.nextFloat();

        float totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}
