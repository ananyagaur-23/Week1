import java.util.Scanner;
public class L11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter a number: ");
		double total = 0.0;
		double num; 
		
		while(true){
			num =  input.nextDouble();
			if (num<=0){
				break;
			}
			total += num;
			System.out.print("Next number: ");
		}
		System.out.println(total);
	}
}
		