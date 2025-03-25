import java.util.Scanner;
public class N8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int sum = 0;
		int originaln = n;
		
		while(originaln!=0){
			int i = originaln%10;
			sum+=i;
			originaln/=10;
		}
		if(n%sum==0){
			System.out.println(n+" is a Harshad number");
		}
		else{
			System.out.println(n+" is not a Harshad number");
		}
	}
}