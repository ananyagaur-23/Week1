import java.util.Scanner;
public class StringIndexOutOfBoundsCase{
	public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); 
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated and caught in main: " + e.getMessage());
        }

        handleException(input);
        
        scanner.close();
    }
}
