import java.util.Scanner;
public class M12{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter base: ");
		int base = input.nextInt();
		System.out.print("Enter power: ");
		int power = input.nextInt();
		
		if(base>0 && power>0){
			int result = 1;
			for(int i = 1; i<=power; i++){
				result = result * base;
			}
			System.out.printf("%d to the power of %d is: %d",base,power,result);
		}
		else{
			System.out.println("Invalid entry");
		}
	}
}