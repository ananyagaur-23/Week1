import java.util.Scanner;

public class CalendarDisplay {

    static String[] monthNames = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    static int[] daysInMonth = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    public static int getFirstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + 31 * m0 / 12) % 7;
    }

    public static void displayCalendar(int month, int year) {
        System.out.printf("%s %d\n", monthNames[month], year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getFirstDay(month, year);
        int totalDays = getDaysInMonth(month, year);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((startDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        displayCalendar(month, year);
    }
}
