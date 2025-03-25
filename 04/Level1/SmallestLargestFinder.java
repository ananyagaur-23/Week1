import java.util.Scanner;
public class SmallestLargestFinder{
	public static int FindSmall(int n1, int n2, int n3){
		int smallest = Math.min(n1, Math.min(n2,n3));
		return smallest;
	}
	public static int FindLarge(int n1, int n2, int n3){
		int largest = Math.max(n1, Math.max(n2,n3));
		return largest;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2 = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int n3 = sc.nextInt();
		
		System.out.print(FindSmall(n1,n2,n3)+" is the smallest among the numbers\n");
		System.out.print(FindLarge(n1,n2,n3)+" is the largest among the numbers\n");
	}
}