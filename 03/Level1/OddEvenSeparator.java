import java.util.Scanner;
public class OddEvenSeparator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a natural numbers: ");
		int num = sc.nextInt();
		
		if(num<1){
			System.out.println("Invalid number");
			return;
		}
		int[] even = new int[num/2+1];
		int[] odd = new int[num/2+1];
		int evenIndex = 0, oddIndex = 0;
		
		for(int i = 1; i<=num;i++){
			if(i%2==0){
				even[evenIndex++]=i;
			}
			else{
				odd[oddIndex++]=i;
			}
		}
		System.out.print("Odd Numbers: ");
		for(int i=0;i<oddIndex;i++){
			System.out.print(odd[i]+", ");
		}
		System.out.print("Even Numbers: ");
		for(int i=0;i<evenIndex;i++){
			System.out.print(even[i]+", ");
		}
	}
}