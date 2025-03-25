public class ProfitAndLossCalculation{
	public static void main(String[] args){
		
		double cp = 129;
		double sp = 191;
		double P = sp - cp;
		double percent = (P/cp)*100;
		
		System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp+"\nThe Profit in INR "+P+" and the Profit Percentage is "+String.format("%.2f", percent)+"%");
		
	}
}