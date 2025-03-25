import java.util.Scanner;
public class AthleteRunRoundsCalculator{
	public static int calculation(int s1, int s2, int s3){
		int perimeter = s1+s2+s3;
		int distance = 5000;
		return (distance/perimeter);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st side length: ");
		int s1 = sc.nextInt();
		System.out.print("Enter the 2nd side length: ");
		int s2 = sc.nextInt();
		System.out.print("Enter the 3rd side length: ");
		int s3 = sc.nextInt();
		
		int rounds = calculation(s1,s2,s3);
		System.out.print("The athlete need to complete "+rounds+" rounds to cover 5kms.");
	}
}
		