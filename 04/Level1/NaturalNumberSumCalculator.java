import java.util.Scanner;
public class NaturalNumberSumCalculator{
	public static int Nnatural(int n){
		int sum = 0;
		for(int i = 1; i<=n; i++){
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.print("Sum of "+n+" natural numbers is: "+Nnatural(n));
	}
}