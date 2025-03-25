import java.util.Scanner;
public class Triangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base: ");
		double b=sc.nextDouble();
		System.out.print("Height: ");
		double h=sc.nextDouble();
		
		double cm = (1.0/2 * b * h);
		double inch = cm/2.54;
		
		System.out.printf("The Area of the triangle in sq in is %.2f and sq cn is %.2f",inch,cm);
	}
}