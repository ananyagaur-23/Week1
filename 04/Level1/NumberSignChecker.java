import java.util.Scanner;
public class NumberSignChecker{
	public static int check(int n){
		if(n>0){
			return 1;
		}
		else if(n<0){
			return -1;
		}
		else{
			return 0;
		}	
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int verify = check(n);
		System.out.print("--> "+ verify);
	}
}