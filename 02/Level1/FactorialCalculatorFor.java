import java.util.Scanner;
public class FactorialCalculatorFor{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer: ");
		int n = input.nextInt();
		
		if(n<0){
			System.out.println("Enter a positive integer!");
		}
		else{
			long fac = 1;
			for (int i = 1; i<=n;i++){
				fac *= i;
			}	
			System.out.printf("Factorial of %d is: %d",n,fac);
		}
	}
}