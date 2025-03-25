import java.util.Scanner;
public class A5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int[] table = new int[4];
		
		for(int i = 6; i<=9 ; i++){
			table[i-6] = num *i;
		}
		System.out.println("Multipilcation table of "+num+": ");
		for(int i = 6; i<=9 ; i++){
			System.out.printf("%d * %d = %d\n",num,i,(table[i-6]));
		}
	}
}