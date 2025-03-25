import java.util.Random;

public class EmployeeBonusCalculator {

    public static double[][] generateEmployeeData() {
        Random random = new Random();
        double[][] employeeData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = 10000 + random.nextInt(90000);
            int yearsOfService = random.nextInt(21);
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }

        return employeeData;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[10][3]; // 10 employees, 3 columns (old salary, bonus, new salary)

        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0;

            if (yearsOfService > 5) {
                bonus = 0.05 * oldSalary;
            } else {
                bonus = 0.02 * oldSalary;
            }

            double newSalary = oldSalary + bonus;

            updatedData[i][0] = oldSalary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }

        return updatedData;
    }

    public static void calculateAndDisplayTotals(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee Bonus Details:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Employee | Old Salary | Bonus  | New Salary");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            double oldSalary = updatedData[i][0];
            double bonus = updatedData[i][1];
            double newSalary = updatedData[i][2];

            System.out.printf("%8d | %10.2f | %6.2f | %10.2f\n", i + 1, oldSalary, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("Total     | %10.2f | %6.2f | %10.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        calculateAndDisplayTotals(updatedData);
    }
}
