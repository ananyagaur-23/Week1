import java.util.Scanner;

public class B9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; 
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print(subject + ": ");
                    marks[i][j] = sc.nextInt();
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
            
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            
            if (percent[i] >= 80) {
                grade[i] = "A";
            } else if (percent[i] >= 70) {
                grade[i] = "B";
            } else if (percent[i] >= 60) {
                grade[i] = "C";
            } else if (percent[i] >= 50) {
                grade[i] = "D";
            } else if (percent[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }
        
        System.out.println("No. Physics Chemistry Maths Percentage Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d  %d  %d  %d  %.2f  %s%n", (i + 1), marks[i][0], marks[i][1], marks[i][2], percent[i], grade[i]);
        }
    }
}