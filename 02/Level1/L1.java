import java.util.Scanner;
 
class L1{
    public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("number: ");
		int n = input.nextInt();
		
		System.out.printf("Is the number %d divisible by 5? %b ",n,(n%5==0));
	}
}