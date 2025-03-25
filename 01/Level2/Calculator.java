import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number1: ");
		double x=input.nextDouble();
		System.out.print("Number2: ");
		double y=input.nextDouble();
		
		double add=x+y; 
		double sub=x-y;
		double mul=x*y;
		double div=x/y;
		
		System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n",x,y,add,sub,mul,div);
	}
}
		
		