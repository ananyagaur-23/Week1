import java.util.Scanner;

public class FindShortestAndLongestWords {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] customSplit(String text) {
        int len = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index++] = len;

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i];
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }

        return words;
    }

    public static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordData) {
        int min = Integer.parseInt(wordData[0][1]);
        int max = Integer.parseInt(wordData[0][1]);
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < wordData.length; i++) {
            int length = Integer.parseInt(wordData[i][1]);
            if (length < min) {
                min = length;
                minIndex = i;
            }
            if (length > max) {
                max = length;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] wordData = wordWithLengths(words);
        int[] result = findShortestAndLongest(wordData);

        System.out.println("\nShortest word: " + wordData[result[0]][0] + " (Length: " + wordData[result[0]][1] + ")");
        System.out.println("Longest word: " + wordData[result[1]][0] + " (Length: " + wordData[result[1]][1] + ")");
    }
}
