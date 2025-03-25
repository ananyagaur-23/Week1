import java.util.Scanner;

public class UserInputFeeCalculation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Fee: ");
		double fee = input.nextDouble();
		
		System.out.print("discountPercent: ");
		double discountPercent = input.nextDouble();
		
		double discount = (discountPercent/100)*fee;
		double afterDiscount = fee-discount;
		
		System.out.printf("The Discount Amount is INR " + discount + " and the final discounted fee is INR " + afterDiscount );
	}
}