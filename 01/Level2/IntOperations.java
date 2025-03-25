import java.util.Scanner;
public class IntOperations{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 3 values: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		int r1=(a+b*c);
		int r2=(a*b+c);
		int r3=(c+a/b);
		int r4=(a%b+c);
		
		System.out.printf("The results of Int Operations are %d, %d, %d, and %d",r1,r2,r3,r4);
	}
}