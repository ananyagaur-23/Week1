public class Z3 {

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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += (int)Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 882;

        int digitCount = countDigits(number);
        int[] digits = getDigits(number);
        int sum = sumOfDigits(digits);
        int squareSum = sumOfSquares(digits);
        boolean harshad = isHarshadNumber(number, digits);
        int[][] frequency = digitFrequency(digits);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + digitCount);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println("\nSum of Digits: " + sum);
        System.out.println("Sum of Squares of Digits: " + squareSum);
        System.out.println("Is Harshad Number: " + harshad);
        System.out.println("Digit Frequencies:");
        for (int[] row : frequency) {
            if (row[1] > 0) {
                System.out.println("Digit " + row[0] + ": " + row[1] + " time(s)");
            }
        }
    }
}
