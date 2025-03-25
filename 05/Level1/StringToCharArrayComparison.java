import java.util.Scanner;
public class StringToCharArrayComparison{
	public static char[] getChars(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        char[] userDefinedArray = getChars(input);
        char[] builtInArray = input.toCharArray();
        
        boolean comparisonResult = compareArrays(userDefinedArray, builtInArray);
        
        System.out.println("\nCharacters using user-defined method: " + new String(userDefinedArray));
        System.out.println("\nCharacters using toCharArray() method: " + new String(builtInArray));
        System.out.println("\nComparison result: " + comparisonResult);
        
        scanner.close();
    }
}
