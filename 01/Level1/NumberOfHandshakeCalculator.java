import java.util.Scanner;

public class NumberOfHandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maximumHandshakes);
    }
}
