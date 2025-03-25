import java.util.Scanner;
public class StudentVoteChecker{
	public static boolean canVote(int age){
		if(age<0){
			return false;
		}
		else if(age>=18){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] studentAges = new int[10];
		
		for(int i = 0; i<10; i++){
		System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean canVote = canVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) +" can vote.");
            } else {
                System.out.println("Student " + (i + 1) +" cannot vote.");
            }	
		}
	}
}
