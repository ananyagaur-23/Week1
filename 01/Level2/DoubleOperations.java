import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 3 values: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		
		double r1=(a+b*c);
		double r2=(a*b+c);
		double r3=(c+a/b);
		double r4=(a%b+c);
		
		System.out.printf("The results of double Operations are %.2f, %.2f, %.2f, and %.2f",r1,r2,r3,r4);
	}
}