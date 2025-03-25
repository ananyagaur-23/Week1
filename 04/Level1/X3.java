import java.util.Scanner;
public class X3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		int numOfStudents = sc.nextInt();
		int combination = (numOfStudents*(numOfStudents - 1))/2;
		System.out.print("Number of possible handshakes between the students are: "+combination);
	}
}