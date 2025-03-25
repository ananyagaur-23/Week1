import java.util.Scanner;
public class B10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int[] freq = new int[10];
		int temp = (n<0) ? -n : n;
		
		if(n==0){
			freq[0]=1;
		}
		else{
			while(temp>0){
				int d = temp%10;
				freq[d]++;
				temp/=10;
			}
		}
		System.out.println("Digit Frequency:");
		for(int i = 0; i<10;i++){
			if(freq[i]>0){
				System.out.println(i+" --> "+freq[i]);
			}
		}
	}
}