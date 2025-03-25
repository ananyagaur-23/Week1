import java.util.Scanner;
public class N3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Physics marks: ");
		int p = sc.nextInt();
		System.out.print("Enter Chemistry marks: ");
		int c = sc.nextInt();
		System.out.print("Enter Maths marks: ");
		int m = sc.nextInt();
		
		int marks = (p+c+m)/3;
		System.out.println("Marks percentage: "+marks+"%");
		
		if(marks>=80){
			System.out.println("Grade: A \nRemarks: above agency-normlaized standards");
		}
		else if(marks>=70 && marks<80){
			System.out.println("Grade: B \nRemarks: at agency-normlaized standards");
		}
		else if(marks>=60 && marks<70){
			System.out.println("Grade: C \nRemarks: below, but approaching agency-normlaized standards");
		}
		else if(marks>=50 && marks<60){
			System.out.println("Grade: D \nRemarks: well below agency-normlaized standards");
		}
		else if(marks>=40 && marks<50){
			System.out.println("Grade: E \nRemarks: too below agency-normlaized standards");
		}
		else{
			System.out.println("Grade: R \nRemarks: Remedial standards");
		}
	}
}