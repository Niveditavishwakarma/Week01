import java.util.Scanner;

public class EmployeeBonus{

    public static void main(String[] args) {
        int employee = 10;
        double[] salaries = new double[employee];
        int[] yearsOfService = new int[employee];
        double[] bonuses = new double[employee];
        double[] newSalaries = new double[employee];

        // Variables to store totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        Scanner scanner = new Scanner(System.in);

        // Input loop for employee data
        for (int i = 0; i < employee; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            // Get salary input
            double salary;
            do {
                System.out.print("Salary: ");
                salary = scanner.nextDouble();
                if (salary <= 0) {
                    System.out.println("Invalid salary. Please enter a positive value.");
                }
            } while (salary <= 0);

            // Get years of service input
            int years;
            do {
                System.out.print("Years of service: ");
                years = scanner.nextInt();
                if (years < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative value.");
                }
            } while (years < 0);

            // Store values in arrays
            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculation loop
        for (int i = 0; i < employee; i++) {
            double bonus;

            // Determine bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus = 0.05 * salaries[i];
            } else {
                bonus = 0.02 * salaries[i];
            }

            // Calculate new salary
            double newSalary = salaries[i] + bonus;

            // Store results in arrays
            bonuses[i] = bonus;
            newSalaries[i] = newSalary;

            // Update totals
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary;
        }

        // Print results
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < employee; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("  Old Salary: " + salaries[i]);
            System.out.println("  Years of Service: " + yearsOfService[i]);
            System.out.println("  Bonus: " + bonuses[i]);
            System.out.println("  New Salary: " + newSalaries[i]);
        }

        // Print totals
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}
