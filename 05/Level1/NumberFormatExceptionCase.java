import java.util.Scanner;
public class NumberFormatExceptionCase{
    public static void generateException(String text) {
        System.out.println(Integer.parseInt(text));
    }

    public static void handleException(String text) {
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception generated and caught in main: " + e.getMessage());
        }

        handleException(input);
        scanner.close();
    }
}
