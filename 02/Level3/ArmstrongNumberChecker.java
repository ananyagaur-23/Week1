import java.util.Scanner;
public class ArmstrongNumberChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int sum = 0;
		int originaln = n;
		
		while(originaln!=0){
			int i = originaln % 10;
			sum += i*i*i;
			originaln /= 10;
		}
		if(sum==n){
			System.out.println(n+" is an Armstrong number.");
		}
		else{
			System.out.println(n+" is not an Armstrong number.");
		}
	}
}
		