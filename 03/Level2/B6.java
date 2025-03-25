import java.util.Scanner;
public class B6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of people: ");
		int people = sc.nextInt();
		
		double[] w = new double[people];
		double[] h = new double[people];
		double[]bmi = new double[people];
		String[] status = new String[people];
		
		for(int i=0;i<people;i++){
			System.out.print("Enter details of "+(i+1)+"th person:-\n");
			System.out.print("Weight: ");
			w[i] = sc.nextDouble();
			System.out.print("Height: ");
			h[i] = sc.nextDouble(); 

			bmi[i] = w[i]/(h[i]*h[i]);
			
			if(bmi[i]<=18.4){
				status[i]= "Underweight";
			}
			else if(bmi[i]>18.4 && bmi[i]<=24.9){
				status[i]= "Normal";
			}
			else if(bmi[i]>24.9 && bmi[i]<=39.9){
				status[i]= "Overweight";
			}
			else{
				status[i]= "Obese";
			}
		}
		System.out.println("S.no. Weight Height BMI Status");
		for(int i = 0; i<people;i++){
			System.out.printf("%d  %.2f  %.2f  %.2f  %s%n",(i+1),w[i],h[i],bmi[i],status[i]);
		}
	}
}
		