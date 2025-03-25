import java.util.Scanner;

public class CountVowelsAndConsonants {

    public static String classifyChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;
        int i = 0;

        try {
            while (true) {
                char ch = text.charAt(i);
                String type = classifyChar(ch);
                if (type.equals("Vowel")) {
                    vowels++;
                } else if (type.equals("Consonant")) {
                    consonants++;
                }
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] result = countVowelsAndConsonants(input);

        System.out.println("\nVowel Count: " + result[0]);
        System.out.println("Consonant Count: " + result[1]);
    }
}
