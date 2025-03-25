import java.util.Scanner;
public class IllegalArgumentExceptionCase{
    public static void generateException(String text) {
        if (text.length() < 6) {
            throw new IllegalArgumentException("String is too short for the given indices.");
        }
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            if (text.length() < 6) {
                throw new IllegalArgumentException("String is too short for the given indices.");
            }
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
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
        } catch (IllegalArgumentException e) {
            System.out.println("Exception generated and caught in main: " + e.getMessage());
        }

        handleException(input);
        scanner.close();
    }
}

