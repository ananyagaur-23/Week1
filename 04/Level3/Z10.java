import java.util.Scanner;

public class Z10 {

    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);
        return (slopeAB == slopeBC && slopeAB == slopeAC);
    }

    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1, y1 for Point A: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter x2, y2 for Point B: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("Enter x3, y3 for Point C: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        if (areCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear based on the slope formula.");
        } else {
            System.out.println("The points are NOT collinear based on the slope formula.");
        }

        if (areCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear based on the area formula.");
        } else {
            System.out.println("The points are NOT collinear based on the area formula.");
        }
    }
}
