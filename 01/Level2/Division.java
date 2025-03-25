import java.util.Scanner;
public class Division{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("number1: ");
		int num1 = sc.nextInt();
		System.out.print("number1: ");
		int num2 = sc.nextInt();
		
		int q = num1/num2;
		int r = num1%num2;
		
		System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d",q,r,num1,num2);
	}
}
