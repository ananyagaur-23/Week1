import java.util.Scanner;
public class X1{
	public static double SimpleInterest(double p, double r, double t){
		return (p*r*t)/100;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Principal: ");
		double p = sc.nextDouble();
		System.out.print("Enter Rate of Interest: ");
		double r = sc.nextDouble();
		System.out.print("Enter Time: ");
		double t = sc.nextDouble();
		
		double SI = SimpleInterest(p,r,t);
		System.out.printf("The Simple Interest is %.2f for Principal of %.2f and Rate of %.2f in %.2f years.%n",SI,p,r,t);
	}
}
		