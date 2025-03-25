import java.util.Scanner;
public class VotingEligibilityChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];
		
		for(int i = 0; i < age.length; i++){
			System.out.print("Enter age of student "+(i+1)+": ");
			age[i]=sc.nextInt();
		}
		for(int i = 0; i < age.length; i++){
			if(age[i]<0){
				System.out.println("\nInvalid age!");
			}
			else if(age[i]>=18){
				System.out.printf("\nAge %d can Vote.",age[i]);
			}
			else{
				System.out.printf("\nAge %d can not Vote.",age[i]);
			}
		}
	}
}