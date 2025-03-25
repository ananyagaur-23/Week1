import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        float weightInPounds = input.nextFloat();

        float weightInKilograms = weightInPounds / 2.2f;

        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKilograms);
    }
}
