import java.util.Scanner;
public class Price{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("unitPrice: ");
		int p=sc.nextInt();
		System.out.print("quantity: ");
		int q=sc.nextInt();
		
		int pq=p*q;
		
		System.out.printf("The total purchase price is INR %d if the quantity %d and unit price is INR %d",p,q,pq);
	}
}
