import java.util.Scanner;

public class TrimSpacesUsingCharAt {

    public static int[] findTrimBounds(String str) {
        int start = 0, end = 0;
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        while (start < len && str.charAt(start) == ' ') {
            start++;
        }

        end = len - 1;
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) s1.charAt(len1++);
        } catch (Exception e) {}

        try {
            while (true) s2.charAt(len2++);
        } catch (Exception e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        int[] bounds = findTrimBounds(input);
        String customTrimmed = (bounds[0] <= bounds[1]) ? customSubstring(input, bounds[0], bounds[1]) : "";

        String builtInTrimmed = input.trim();

        boolean match = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("\nCustom Trimmed: [" + customTrimmed + "]");
        System.out.println("Built-in Trimmed: [" + builtInTrimmed + "]");
        System.out.println("Match: " + match);
    }
}
