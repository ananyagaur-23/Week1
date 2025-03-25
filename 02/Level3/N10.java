import java.util.Scanner;
public class N10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double f = sc.nextDouble();
        System.out.print("Enter second number: ");
        double s = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = sc.next(); 
		double result;
		
		switch(op){
			case "+":
				result = f+s;
				System.out.println("Result: "+result);
				break;
			case "-":
				result = f-s;
				System.out.println("Result: "+result);
				break;
			case "*":
				result = f*s;
				System.out.println("Result: "+result);
				break;
			case "/":
				if(s!=0){
					result = f/s;
					System.out.println("Result: "+result);
				}
				else{
					System.out.println("Division by 0 is not allowed");
				}
				break;
			default:
				System.out.println("Invalid operator");
		}
	}
}