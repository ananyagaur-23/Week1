import java.util.Scanner;
public class M6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Amar's age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = input.nextInt();
        
        System.out.print("Enter Amar's height: ");
        int heightAmar = input.nextInt();
        System.out.print("Enter Akbar's height: ");
        int heightAkbar = input.nextInt();
        System.out.print("Enter Anthony's height: ");
        int heightAnthony = input.nextInt();
		
		int smallAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
		String youngFriend = (smallAge == ageAmar) ? "Amar" : (smallAge == ageAkbar) ? "Akbar" : "Anthony";
		
		int tallHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
		String tallestFriend = (tallHeight == heightAmar) ? "Amar" : (tallHeight == heightAkbar) ? "Akbar" : "Anthony";
		
		System.out.println("The youngest friend is: "+ youngFriend);
		System.out.println("The tallest friend is: "+ tallestFriend);
	}
}