import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi;
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            double weight = scanner.nextDouble();
            double height = scanner.nextDouble();
            data[i][0] = weight;
            data[i][1] = height;
        }

        calculateBMI(data);
        String[] statuses = getBMIStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + data[i][0] +
                    " kg, Height = " + data[i][1] + " cm, BMI = " +
                    String.format("%.2f", data[i][2]) + ", Status = " + statuses[i]);
        }
    }
}
