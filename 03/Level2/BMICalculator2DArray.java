import java.util.Scanner;
public class BMICalculator2DArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        double[][] personData = new double[people][3]; 
        String[] status = new String[people];

        for (int i = 0; i < people; i++) {
            System.out.println("Enter details of " + (i + 1) + "th person:");
            
            do {
                System.out.print("Weight: ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Height: ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4) {
                status[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                status[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("S.no. Weight Height BMI Status");
        for (int i = 0; i < people; i++) {
            System.out.printf("%d  %.2f  %.2f  %.2f  %s%n", (i + 1), personData[i][0], personData[i][1], personData[i][2], status[i]);
        }
    }
}
