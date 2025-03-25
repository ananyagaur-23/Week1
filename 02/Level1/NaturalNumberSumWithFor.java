import java.util.Scanner;
public class NaturalNumberSumWithFor{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = input.nextInt();
		
		if (n>0){
			int formula =  n * (n+1)/2;
			
			int loop = 0;
			for (int i = 1;i<=n;i++){
				loop += i;
			}
			
			System.out.println("Result using formula: "+formula);
			System.out.println("Result using for loop: "+loop);
			
			if (formula==loop){
				System.out.println("Both results match!");
			}
			else{
				System.out.println("Error, results don't match");
			}
		}
	}
}
			