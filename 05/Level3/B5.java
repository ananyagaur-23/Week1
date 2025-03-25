import java.util.Scanner;

public class B5 {

    public static char[] uniqueCharacters(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {}

        char[] unique = new char[length];
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
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

    public static String[][] getCharFrequencies(String text) {
        int[] freq = new int[256];
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                freq[(int) ch]++;
            } catch (Exception e) {
                break;
            }
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = Character.toString(ch);
            result[i][1] = Integer.toString(freq[(int) ch]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = getCharFrequencies(input);

        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.printf("   %s      |     %s%n", frequencies[i][0], frequencies[i][1]);
        }

        scanner.close();
    }
}
