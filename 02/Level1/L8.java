import java.util.Scanner;
 
class L8{
    public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Counter: ");
		int c = input.nextInt();
		
		while(c>0){
			System.out.println(c);
			c--;
		}
		System.out.println("Blast Off!");
	}
}