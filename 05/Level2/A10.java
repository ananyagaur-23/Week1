import java.util.Random;

public class A10 {

    public static double[][] generateMarks(int n) {
        Random rand = new Random();
        double[][] marks = new double[n][3]; // 3 subjects: Physics, Chemistry, Maths
        for (int i = 0; i < n; i++) {
            marks[i][0] = rand.nextInt(100) + 1; // Random mark between 1 and 100 for Physics
            marks[i][1] = rand.nextInt(100) + 1; // Random mark between 1 and 100 for Chemistry
            marks[i][2] = rand.nextInt(100) + 1; // Random mark between 1 and 100 for Maths
        }
        return marks;
    }

    public static double[][] calculateTotalAndPercentage(double[][] marks) {
        double[][] result = new double[marks.length][4]; // 4 columns: Total, Average, Percentage, Grade (initially set to 0)
        for (int i = 0; i < marks.length; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3;
            double percentage = Math.round((total / 300) * 100 * 100.0) / 100.0; // Round to 2 decimal places

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    public static String[][] calculateGrade(double[][] result) {
        String[][] grades = new String[result.length][2]; // 2 columns: Percentage and Grade
        for (int i = 0; i < result.length; i++) {
            double percentage = result[i][2];
            String grade = "";
            String remarks = "";

            if (percentage >= 80) {
                grade = "A";
                remarks = "(Level 4, above agency-normalized standards)";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "(Level 3, at agency-normalized standards)";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "(Level 2, below, but approaching agency-normalized standards)";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "(Level 1, well below agency-normalized standards)";
            } else if (percentage >= 40) {
                grade = "E";
                remarks = "(Level 1-, too below agency-normalized standards)";
            } else {
                grade = "R";
                remarks = "(Remedial standards)";
            }

            grades[i][0] = String.format("%.2f", percentage); // Format percentage to 2 decimal places
            grades[i][1] = grade + " " + remarks;
        }
        return grades;
    }

    public static void displayScorecard(double[][] marks, double[][] result, String[][] grades) {
        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf((i + 1) + "\t");
            System.out.printf("%.2f\t", marks[i][0]);
            System.out.printf("%.2f\t", marks[i][1]);
            System.out.printf("%.2f\t", marks[i][2]);
            System.out.printf("%.2f\t", result[i][0]);
            System.out.printf("%.2f\t", result[i][1]);
            System.out.printf("%s%%\t", grades[i][0]);
            System.out.printf("%s\n", grades[i][1]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Number of students
        double[][] marks = generateMarks(numStudents);
        double[][] result = calculateTotalAndPercentage(marks);
        String[][] grades = calculateGrade(result);
        displayScorecard(marks, result, grades);
    }
}
