import java.util.Scanner;
public class GreatestFactorFinderForLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		int greatestFactor = 1;
		
		if(num>0){
			for(int i = num - 1; i>0; i--){
				if(num%i == 0){
					greatestFactor = i;
					break;
				}
			}
			System.out.printf("The greatest factor of %d besides itself is: %d",num,greatestFactor);
		}
		else{
			System.out.println("Invalid number");
		}
	}
}