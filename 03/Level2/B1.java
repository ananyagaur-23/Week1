import java.util.Scanner;

public class B1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEmployees = 10;
        double[] salary = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonusAmount = new double[numEmployees];
        double[] newSalary = new double[numEmployees];

        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        for (int i = 0; i < numEmployees; i++) {
            while (true) {
                System.out.print("Enter salary of employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();

                System.out.print("Enter years of service of employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextDouble();

                if (salary[i] > 0 && yearsOfService[i] >= 0) {
                    break;
                } else {
                    System.out.println("Salary must be positive, and years of service cannot be negative.");
                }
            }
        }

        for (int i = 0; i < numEmployees; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonusAmount[i] = salary[i] * bonusPercentage;
            newSalary[i] = salary[i] + bonusAmount[i];

            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee Details with Bonus and New Salary:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                    (i + 1), salary[i], bonusAmount[i], newSalary[i]);
        }

        System.out.printf("\nTotal Bonus Payout by Zara: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        sc.close();
    }
}
