import java.util.Scanner;
public class BMICalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter weight: ");
		double w = sc.nextDouble();  
		System.out.print("Enter height: ");
		double h = sc.nextDouble() / 100;
		
		double BMI = w/(h*h);
		
		if(BMI<=18.4){
			System.out.println("Underweight");
		}
		else if(BMI>18.4 && BMI<=24.9){
			System.out.println("Normal");
		}
		else if(BMI>25.0 && BMI<=39.9){
			System.out.println("Overweight");
		}
		else{
			System.out.println("Obese");
		}
		System.out.println("Your BMI: "+BMI);
	}
}