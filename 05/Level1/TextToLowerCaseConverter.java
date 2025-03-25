import java.util.Scanner;
public class TextToLowerCaseConverter{
    public static String toLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String lowerCaseCustom = toLowerCaseCustom(input);
        String lowerCaseBuiltIn = input.toLowerCase();
        
        boolean comparisonResult = compareStrings(lowerCaseCustom, lowerCaseBuiltIn);
        
        System.out.println("\nLowercase using custom method: " + lowerCaseCustom);
        System.out.println("Lowercase using built-in method: " + lowerCaseBuiltIn);
        System.out.println("Comparison result: " + comparisonResult);
        
        scanner.close();
    }
}
