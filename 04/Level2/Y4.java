import java.util.Scanner;
public class Y4{
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        double miles = km * km2miles;
        return miles;
    }
    public static double convertMilesTokm(double mile) {
        double miles2km = 1.60934;
        double kilometers = mile * miles2km;
        return kilometers;
    }
    public static double convertMetersToFeet(double m) {
        double meters2feet = 3.28084;
        double feet = m * meters2feet;
        return feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        double meters = feet * feet2meters;
        return meters;
    }
//main body from the code from here. so im not confused!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance: ");
        double d = sc.nextDouble();
		System.out.print("Enter what type to convert to: ");
		String c = sc.next();
	
	
		if(c == "miles"){
			System.out.println("\nThe conversion of Kilometers to Miles is: "+convertKmToMiles(d));
		}
		else if(c == "kilometers"){
			System.out.println("\nThe conversion of Miles to Kilometers is: "+convertMilesTokm(d));
		}
		else if(c == "feet"){
			System.out.println("\nThe conversion of Meters to Feet is: "+convertMetersToFeet(d));
		}
		else if(c == "meters"){
			System.out.println("\nThe conversion of Feet to Meters is: "+convertFeetToMeters(d));
		}
		else{
			System.out.println("\nInvalid conversion type!");
		}
    }
}
