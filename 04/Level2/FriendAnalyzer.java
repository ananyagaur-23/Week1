import java.util.Scanner;

public class FriendAnalyzer {
    public static String youngest(int[] ages, String[] names) {
        int minAge = ages[0];
        String youngestFriend = names[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend + " with age " + minAge;
    }

    public static String tallest(int[] heights, String[] names) {
        int maxHeight = heights[0];
        String tallestFriend = names[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend + " with height " + maxHeight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + names[i] + "'s age: ");
            ages[i] = sc.nextInt();
            System.out.print("Enter " + names[i] + "'s height: ");
            heights[i] = sc.nextInt();
		}
        System.out.println("\nThe youngest friend is: " + youngest(ages, names));
        System.out.println("The tallest friend is: " + tallest(heights, names));
    }
}