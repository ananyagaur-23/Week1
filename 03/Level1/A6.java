import java.util.Scanner;
public class A6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] h = new double[11];
		double sum = 0.0;
		
		System.out.println("Enter the heights of 11 football players");
		for(int i = 0;i<h.length;i++){
			System.out.print("Player "+(i+1)+" height: ");
			h[i] = sc.nextDouble();
		sum += h[i];
		}
		double avgH = sum/h.length;
		System.out.printf("\nThe mean height of the football team is: %.2f meters.",avgH);
	}
}