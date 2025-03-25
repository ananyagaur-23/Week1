import java.util.Scanner;
public class X2{
	public static int handshakes(int n){
		return (n*(n-1))/2;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		int times = handshakes(n);
		System.out.println("The maximum number of handshakes amongst "+n+" students is "+times+" handshakes.");
	}
}