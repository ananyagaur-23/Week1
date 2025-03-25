import java.util.Scanner;
public class Distance{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("distanceInFeet: ");
		double f = sc.nextDouble();
		
		double y = f/3;
		double m = y/1760;
		
		System.out.printf("The distance in yards is %.2f while the distance in miles is %f",y,m);
	}
}
		