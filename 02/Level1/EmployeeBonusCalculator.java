import java.util.Scanner;
public class EmployeeBonusCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter salary: ");
		int s = input.nextInt();
		System.out.print("Enter years of service: ");
		int y = input.nextInt();
		
		if(y>5){
			double bonus = s * 5.0/100;
			System.out.println("Bonus = "+bonus);
		}
		else{
			System.out.println("Not eligible for bonus.");
		}
	}
}