import java.util.Scanner;

public class UserInputDistanceConversion{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("KM = ");
		double km = input.nextDouble();
		
		double mile = km * 1.6;
		
		System.out.println("The total miles is "+String.format("%.2f",mile)+" mile for the given "+String.format("%.2f",km)+" km.");
	}
}
		