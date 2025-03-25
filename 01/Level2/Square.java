import java.util.Scanner;
public class Square{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Perimeter: ");
		double p = sc.nextInt();
		double s = p/4;
		System.out.printf("The length of the side is %.2f whose perimeter is %.0f",s,p);
	}
}