import java.util.Scanner;
public class DigitCounter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int count = 0;
		
		while(n!=0){
			int i = n%10;
			count+=1;
			n/=10;
		}
		System.out.println("Number of digits in given number is: "+count);
	}
}