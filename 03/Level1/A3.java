import java.util.Scanner;
public class A3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int[] table = new int[10];
		
		for(int i = 0; i<table.length ; i++){
			table[i] = num *(i+1);
		}
		System.out.println("Multipilcation table of "+num+": ");
		for(int i = 0; i<table.length ; i++){
			System.out.printf("%d * %d = %d\n",num,(i+1),(table[i]));
		}
	}
}