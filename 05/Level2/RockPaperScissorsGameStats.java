import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGameStats {

    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int index = (int) (Math.random() * 3);
        return choices[index];
    }

    public static String getResult(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] getWinStats(String[][] results) {
        int userWins = 0, compWins = 0, draws = 0;
        for (String[] row : results) {
            if (row[2].equals("User")) userWins++;
            else if (row[2].equals("Computer")) compWins++;
            else draws++;
        }
        int total = results.length;
        double userPct = (userWins * 100.0) / total;
        double compPct = (compWins * 100.0) / total;
        String[][] stats = {
                {"User", String.valueOf(userWins), String.format("%.2f", userPct) + "%"},
                {"Computer", String.valueOf(compWins), String.format("%.2f", compPct) + "%"},
                {"Draws", String.valueOf(draws), "-"}
        };
        return stats;
    }

    public static void displayGameResults(String[][] results, String[][] stats) {
        System.out.println("\nGame\tUser\tComputer\tResult");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nSummary:");
        System.out.println("Player\tWins\tWin %");
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t" + stat[1] + "\t" + stat[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        String[][] results = new String[n][3];
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String result = getResult(user, comp);
            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = result;
        }

        String[][] stats = getWinStats(results);
        displayGameResults(results, stats);
    }
}
