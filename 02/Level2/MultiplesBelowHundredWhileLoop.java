import java.util.Scanner;
public class MultiplesBelowHundredWhileLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		if(num>0 && num<100){
			System.out.printf("Multiples of %d are: ",num);
			int i = num - 1;
			while(i>0){
				if(num%i==0){
					System.out.print(i+" ");
				}
				i--;
				continue;
			}
		}
		else{
			System.out.print("Invalid number!");
		}
	}
}