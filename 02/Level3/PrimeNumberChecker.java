import java.util.Scanner;
public class PrimeNumberChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		if(n<=1){
			isPrime =  false;
		}
		else{
			for(int i=2;i<=n/2;i++){
				if(n%i==0){
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime==true){
			System.out.println(n+" is a Prime number");
		}
		else{
			System.out.println(n+" is not a Prime number");
		}
	}
}