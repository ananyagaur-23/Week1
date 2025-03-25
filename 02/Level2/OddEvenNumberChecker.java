import java.util.Scanner;
public class OddEvenNumberChecker{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();
		
		if(n>0){
			for(int i = 1; i<=n; i++){
				if(i%2==0){
					System.out.println(i+" is an even number.");
				}
				else{
					System.out.println(i+" is an odd number.");
				}
			}
		}
	}
}