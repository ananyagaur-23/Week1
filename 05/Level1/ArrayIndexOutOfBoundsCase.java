import java.util.Scanner;
public class ArrayIndexOutOfBoundsCase{
    public static void generateException(String[] names, int index) {
        System.out.println(names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];
        
        System.out.println("Enter names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.next();
        }
        
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        
        try {
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception generated and caught in main: " + e.getMessage());
        }

        handleException(names, index);
        scanner.close();
    }
}
