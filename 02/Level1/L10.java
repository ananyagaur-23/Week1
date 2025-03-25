import java.util.Scanner;
public class L10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double total = 0.0;
		double num = input.nextDouble();
		
		while(num!=0){
			total = num + total;
			System.out.print("Enter next number: ");
			num = input.nextDouble();
		}
		System.out.println(total);
	}
}
		
		