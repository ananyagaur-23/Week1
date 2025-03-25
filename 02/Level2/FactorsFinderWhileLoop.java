import java.util.Scanner;
public class FactorsFinderWhileLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		if(n>0){
			System.out.printf("Factors of %d are: ",n);
			
			int i = 1;
			while(i<=n){
				if(n%i==0){
					System.out.print(i+" ");
				}
				i++;
			}
		}
	}
}