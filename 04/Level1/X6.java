import java.util.Scanner;
public class X6{
	public static boolean spring(int d, int m){
		if((m==3 && d>= 20) || (m == 4) || (m == 5) || (m == 6 && d<= 20)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month: ");
		int m = sc.nextInt();
		System.out.print("Enter Day: ");
		int d = sc.nextInt();
		
		if(spring(d,m)){
			System.out.print("It's a Spring Season.");
		}
		else{
			System.out.print("Not a Spring Season.");
		}
	}
}