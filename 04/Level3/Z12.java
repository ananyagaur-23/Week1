import java.util.Random;

public class Z12 {

    public static int[][] generateStudentScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51);
            scores[i][1] = 50 + random.nextInt(51);
            scores[i][2] = 50 + random.nextInt(51);
        }

        return scores;
    }

    public static double[][] calculateScores(int[][] scores) {
        double[][] results = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student Scorecard:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%7d | %7d | %9d | %4d | %5.2f | %7.2f | %10.2f\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }

        System.out.println("--------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numStudents = 5;
        int[][] scores = generateStudentScores(numStudents);
        double[][] results = calculateScores(scores);
        displayScorecard(scores, results);
    }
}
