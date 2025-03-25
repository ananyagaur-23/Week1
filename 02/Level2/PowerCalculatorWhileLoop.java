import java.util.Scanner;
public class PowerCalculatorWhileLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter base: ");
		int base = input.nextInt();
		System.out.print("Enter power: ");
		int power = input.nextInt();
		
		if(base>0 && power>0){
			int result = 1;
			int i = 1;
			while(i<=power){
				result = result * base;
				i++;
			}
			System.out.printf("%d to the power of %d is: %d",base,power,result);
		}
		else{
			System.out.println("Invalid entry");
		}
	}
}