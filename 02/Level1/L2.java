import java.util.Scanner;
 
class L2{
    public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("number1: ");
		int n1 = input.nextInt();
		System.out.print("number2: ");
		int n2 = input.nextInt();
		System.out.print("number3: ");
		int n3 = input.nextInt();
		
		
		System.out.println("Is the first number the smallest? " + ((n1<n2) && (n1<n3)));
	}
}