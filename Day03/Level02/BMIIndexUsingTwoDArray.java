import java.util.Scanner;

public class BMIIndexUsingTwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Initialize the multi-dimensional array and weight status array
        double[][] personData = new double[number][3]; // [height, weight, BMI]
        String[] weightStatus = new String[number];

        // Input height and weight for each person
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");

            // Input height
            do {
                System.out.print("Enter height (in meters): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be positive. Please re-enter.");
                }
            } while (personData[i][0] <= 0);

            // Input weight
            do {
                System.out.print("Enter weight (in kilograms): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be positive. Please re-enter.");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {
            // Calculating BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status for each person
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
