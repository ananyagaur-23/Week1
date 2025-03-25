import java.util.Scanner;
public class GreatestFactorFinderWhileLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		int greatestFactor = 1;
		
		if(num>0){
			int counter = num - 1;
			while(counter>0){
				if(num%counter==0){
					greatestFactor=counter;
					break;
				}
				counter--;
			}
			System.out.printf("The greatest factor of %d is: %d",num,greatestFactor);
		}
		else{
			System.out.println("Invalid number");
		}
	}
}
			