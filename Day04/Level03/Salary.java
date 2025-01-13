
import java.util.Random;

public class Salary{    
    // Method to generate salary and years of service
    public static int[][] generateSalaryAndService(int numEmployees) {
        Random random = new Random();
        int[][] data = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            // Generate random 5-digit salary between 10000 and 99999
            data[i][0] = 10000 + random.nextInt(90000);
            // Generate random years of service between 1 and 10
            data[i][1] = 1 + random.nextInt(10);
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int yearsOfService = data[i][1];

            // Calculate bonus percentage
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;

            // Calculate new salary
            double newSalary = salary + bonus;

            // Store bonus and new salary in the result array
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Method to calculate and display total bonus, old salary sum, and new salary sum
    public static void calculateAndDisplayTotals(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee   OldSalary  Years  Bonus      NewSalary");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int yearsOfService = oldData[i][1];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.println(
                (i + 1) + "          " + oldSalary + "      " + yearsOfService +
                "     " + String.format("%.2f", bonus) + "     " + String.format("%.2f", newSalary)
            );
        }

        System.out.println("-------------------------------------------------");
        System.out.println(
            "Total      " + String.format("%.2f", totalOldSalary) +
            "             " + String.format("%.2f", totalBonus) +
            "   " + String.format("%.2f", totalNewSalary)
        );
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        //Generate salary and years of service
        int[][] oldData = generateSalaryAndService(numEmployees);

        //Calculate new salary and bonus
        double[][] newData = calculateNewSalaryAndBonus(oldData);

        // Calculate and display totals
        calculateAndDisplayTotals(oldData, newData);
    }
}

