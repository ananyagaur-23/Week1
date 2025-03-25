import java.util.Scanner;
 
class SpringSeasonChecker{
    public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Month: ");
		int m = input.nextInt();
		System.out.print("Day: ");
		int d = input.nextInt();
		
		boolean spring = (m == 3 && d >=20) || (m == 4) || (m == 5) || (m == 6 && d <=20);
		
		if (spring){
			System.out.println("It's a Spring Season");
		}
		else {
			System.out.println("Not a Spring Season");
		}
	}
}