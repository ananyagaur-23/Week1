import java.util.Scanner;
public class A9{
    public static String toUpperCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
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
        
        String upperCaseCustom = toUpperCaseCustom(input);
        String upperCaseBuiltIn = input.toUpperCase();
        
        boolean comparisonResult = compareStrings(upperCaseCustom, upperCaseBuiltIn);
        
        System.out.println("\nUppercase using custom method: " + upperCaseCustom);
        System.out.println("Uppercase using built-in method: " + upperCaseBuiltIn);
        System.out.println("Comparison result: " + comparisonResult);
        
        scanner.close();
    }
}