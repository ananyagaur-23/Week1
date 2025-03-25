import java.util.Scanner;
public class NumberAnalysisComparator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i = 0; i < num.length; i++){
			System.out.printf("Enter the %d number: ",(i+1));
			num[i] = sc.nextInt();
		}
		
		for(int i : num){
			if(i>0){
				if(i%2==0){
					System.out.println(i+" is Positive & Even");
				}
				else{
					System.out.println(i+" is Positive & Odd");
				}
			}
			else if(i<0){
				System.out.println(i+" is Negative");
			}
			else{
				System.out.println(i+" is Zero");
			}
		}
		if(num[0]==num[4]){
			System.out.println("first and last elements are equal");
		}
		else if(num[0]>num[4]){
			System.out.println("first element is greater than the last");
		}
		else{
			System.out.println("first element is smaller than the last");
		}
	}
}
		
		