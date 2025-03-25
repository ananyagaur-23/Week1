import java.util.Scanner;
public class NaturalNumberSum{
	public static int NFormula(int n){
		int formula = n*(n+1)/2;
		return formula;
	}
	public static int NRecursion(int n){
		if(n==0){
			return 0;
		}	
		return n + NRecursion(n-1);
	}
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int F = NFormula(n);
		int R = NRecursion(n);
		
		if(F==R){
			System.out.println("The results by Recursion & Formula match");
		}
		else{
			System.out.println("Error: The result of both methods do not match");
		}
		System.out.println("Sum of "+n+" natural numbers by Recursion is "+R+" and by Formula is "+F);
	}
}