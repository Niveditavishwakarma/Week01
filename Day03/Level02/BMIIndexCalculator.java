import java.util.Scanner;

public class BMIIndexCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input height and weight for each person
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter height (in meters): ");
            height[i] = scanner.nextDouble();
            System.out.print("Enter weight (in kilograms): ");
            weight[i] = scanner.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println( "Height" + " " +  "Weight" + " "+ "BMI" +" " + "Status: " );
        for (int i = 0; i < n; i++) {
            System.out.println( height[i]+"  " + " " + weight[i]+ "  " + " " + bmi[i]+"  "+ "  " + status[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
