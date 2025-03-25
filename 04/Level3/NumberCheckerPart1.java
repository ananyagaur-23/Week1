public class NumberCheckerPart1{

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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    public static int[] findTwoLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > max) {
                secondMax = max;
                max = digit;
            } else if (digit > secondMax && digit != max) {
                secondMax = digit;
            }
        }

        return new int[]{max, secondMax};
    }

    public static int[] findTwoSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < min) {
                secondMin = min;
                min = digit;
            } else if (digit < secondMin && digit != min) {
                secondMin = digit;
            }
        }

        return new int[]{min, secondMin};
    }

    public static void main(String[] args) {
        int number = 153;

        int digitCount = countDigits(number);
        int[] digits = getDigits(number);
        boolean duck = isDuckNumber(digits);
        boolean armstrong = isArmstrong(number, digits);
        int[] largestTwo = findTwoLargest(digits);
        int[] smallestTwo = findTwoSmallest(digits);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + digitCount);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println("\nIs Duck Number: " + duck);
        System.out.println("Is Armstrong Number: " + armstrong);
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
    }
}
