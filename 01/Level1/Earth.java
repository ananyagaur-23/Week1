public class Earth{
	public static void main(String[] args){
		
		double r = 6378;
		double vkm = (4/3)* Math.PI * Math.pow(r,3);
		double vmile = (vkm * 1.6);
		
		System.out.println("The Volume of earth in cubic kilometers is "+String.format("%.2f",vkm)+" and cubic miles is "+String.format("%.2f",vmile));
	}
}