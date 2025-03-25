public class NumberCheckerPart3 {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12321;

        int digitCount = countDigits(number);
        int[] digits = getDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        boolean palindrome = isPalindrome(digits);
        boolean duck = isDuckNumber(digits);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + digitCount);

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.print("\nReversed Digits: ");
        for (int d : reversedDigits) {
            System.out.print(d + " ");
        }

        System.out.println("\nIs Palindrome: " + palindrome);
        System.out.println("Is Duck Number: " + duck);
    }
}
