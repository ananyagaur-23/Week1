import java.util.Scanner;

public class CharFrequencyCounter {

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

        boolean[] added = new boolean[256];
        int length = 0;
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (!added[(int) ch]) {
                    added[(int) ch] = true;
                    length++;
                }
            } catch (Exception e) {
                break;
            }
        }

        String[][] result = new String[length][2];
        boolean[] stored = new boolean[256];
        int index = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                int ascii = (int) ch;
                if (!stored[ascii]) {
                    stored[ascii] = true;
                    result[index][0] = Character.toString(ch);
                    result[index][1] = Integer.toString(freq[ascii]);
                    index++;
                }
            } catch (Exception e) {
                break;
            }
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
