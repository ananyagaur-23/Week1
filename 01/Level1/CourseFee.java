public class CourseFee{
	public static void main(String[] args){
		
		double fee = 125000;
		double discountPercent = 10;
		double discount = (discountPercent/100)*fee;
		double afterDiscount = fee-discount;
		
		System.out.printf("The Discount Amount is INR " + discount + " and the final discounted fee is INR " + afterDiscount );
	}
}