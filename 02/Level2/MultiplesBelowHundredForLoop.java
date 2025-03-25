import java.util.Scanner;
public class MultiplesBelowHundredForLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		if(num>0 && num<100){
			System.out.printf("Multiples of %d are: ",num);
			for(int i = num - 1;i>0;i--){
				if(num%i==0){
					System.out.print(i+" ");
					continue;
				}
			}
		}
		else{
			System.out.print("Invalid number!");
		}
	}
}