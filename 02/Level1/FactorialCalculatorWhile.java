import java.util.Scanner;
public class FactorialCalculatorWhile{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer: ");
		int n = input.nextInt();
		
		if(n<0){
			System.out.println("Enter a positive integer!");
		}
		else{
			long fac = 1;
			int i = 1;
			while(i<=n){
				fac *= i;
				i++;
			}
			System.out.printf("Factorial of %d is: %d",n,fac);
		}
	}
}