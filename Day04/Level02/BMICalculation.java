import java.util.Scanner;

public class BMICalculation {

    // Method to calculate BMI and populate the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert height from cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // Calculate BMI
        }
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight, height, and BMI for 10 members
        double[][] data = new double[10][3];

        // Input weight and height for each member
        System.out.println("Enter weight (in kg) and height (in cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i + 1) + " Weight (kg): ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Member " + (i + 1) + " Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for all members
        calculateBMI(data);

        // Display details for each member
        System.out.println("\nDetails of each member:");
        System.out.println("Weight (kg)   |  Height (cm)   |      BMI      |    Status");
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = data[i][2];
            String status = getBMIStatus(bmi);
            System.out.println(weight + "          " + height + "        " + bmi + "        " + status);
        }

        scanner.close();
    }
}


