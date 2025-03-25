import java.util.Scanner;
public class X12{
    public static double[] TrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); 
        double[] trigValues = new double[3];

        trigValues[0] = Math.sin(radians); 
        trigValues[1] = Math.cos(radians); 
        trigValues[2] = Math.tan(radians); 
        return trigValues;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = sc.nextDouble();

        double[] trigValues = TrigonometricFunctions(angle);
        System.out.printf("Sine(%.2f) = %.4f%n", angle, trigValues[0]);
        System.out.printf("Cosine(%.2f) = %.4f%n", angle, trigValues[1]);

        if (Math.abs(trigValues[1]) < 1e-10) {
            System.out.printf("Tangent(%.2f) is undefined%n", angle);
        } else {
            System.out.printf("Tangent(%.2f) = %.4f%n", angle, trigValues[2]);
		}
    }
}
