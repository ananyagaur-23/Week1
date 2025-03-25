import java.util.Scanner;
public class L12{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = input.nextInt();
		
		if (n>0){
			int formula = n * (n+1)/2;
			
			int loop = 0, i = 1;
			while(i<=n){
				loop += i;
				i++;
			}
			System.out.println("Sum using formula: "+formula);
			System.out.println("Sum using while loop: "+loop);
			
			if (formula == loop){
				System.out.println("Both result match!");
			}
			else{
				System.out.println("Something went wrong, result don't match.");
			}
		}
	}
}