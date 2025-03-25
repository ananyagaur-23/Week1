import java.util.Scanner;

public class FeetToInchConversion{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Height: ");
		double h = input.nextDouble();
		
		double i = h / 2.54;
		double f = i / 12;
		
		System.out.println("Your Height in cm is " + h + " while in feet is " + String.format("%.2f",f) + " and inches is " + String.format("%.2f",i));
	}
}