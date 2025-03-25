import java.util.Scanner;

public class X11{
    public static double WindChill(double temp, double speed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Enter wind speed: ");
        double speed = sc.nextDouble();

        if (temp > 50 || speed < 3) {
            System.out.println("Invalid");
        } else {
            double chill = WindChill(temp, speed);
            System.out.printf("The wind chill temperature is: %.2f F%n", chill);
        }

        sc.close();
    }
}
