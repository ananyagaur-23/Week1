import java.util.Scanner;

public class UniqueCharacterFinder {

    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {
        }
        return length;
    }

    public static char[] findUniqueChars(String text) {
        int len = findLength(text);
        char[] unique = new char[len];
        int uniqueIndex = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueIndex++] = current;
            }
        }

        char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] uniqueChars = findUniqueChars(input);

        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }

        scanner.close();
    }
}
