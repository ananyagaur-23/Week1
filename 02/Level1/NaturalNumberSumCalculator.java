import java.util.Scanner;
 
class NaturalNumberSumCalculator{
    public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("number: ");
		int n = input.nextInt();
		
		if (n>=1){
			int sum = n*(n+1)/2;
			System.out.printf("The sum of %d natural numbers is %d",n,sum);
		}
		else{
			System.out.printf("The number %d is not a natural number",n);
		}
		
	}
}