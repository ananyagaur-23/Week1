import java.util.Scanner;
public class X9{
	public static int[] QandR(int n1, int n2){
		int[] divided = new int[2];
		divided[0] = n1/n2;
		divided[1] = n1%n2;
		return divided;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2 = sc.nextInt();
		
		int[] divided = QandR(n1,n2);
        System.out.println("Quotient: " + divided[0]);
        System.out.println("Remainder: " + divided[1]);
    }
}		
