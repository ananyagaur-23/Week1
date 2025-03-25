import java.util.Scanner;
 
class NumberSignChecker{
    public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Number: ");
		int n = input.nextInt();
		
		if(n>0){
			System.out.println("Positive.");
		}
		else if(n<0){
			System.out.println("Negative.");
		}
		else{
			System.out.println("Zero!");
		}
	}
}