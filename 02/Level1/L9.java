import java.util.Scanner;
 
class L9{
    public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Counter: ");
		
		for(int c = input.nextInt();c>0;c--){
			System.out.println(c);
		}
		System.out.println("Blast Off!");
	}
}