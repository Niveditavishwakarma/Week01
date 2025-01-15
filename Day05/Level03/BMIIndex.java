import java.util.Scanner;

public class BMIExercise {

    // Method to calculate BMI and return BMI and status
    public static String[][] calculateBMI(double[][] heightWeight) {
        String[][] bmiStatus = new String[heightWeight.length][4];

        for (int i = 0; i < heightWeight.length; i++) {
            double weight = heightWeight[i][0];
            double heightInMeters = heightWeight[i][1] / 100.0; 
            double bmi = weight / (heightInMeters * heightInMeters); 

            // Round BMI to 2 decimal places
            bmi = Math.round(bmi * 100.0) / 100.0;

            // Determine BMI status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal weight";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store values in 2D array
            bmiStatus[i][0] = String.valueOf(heightWeight[i][1]); 
            bmiStatus[i][1] = String.valueOf(weight); 
            bmiStatus[i][2] = String.valueOf(bmi);
            bmiStatus[i][3] = status; 
        }

        return bmiStatus;
    }

    // Method to display the results in a tabular format
    public static void displayBMIReport(String[][] bmiReport) {
        System.out.println("Person   Height(cm)    Weight (kg)     BMI     Status");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < bmiReport.length; i++) {
            System.out.print((i + 1) + "\t\t"); 
            System.out.print(bmiReport[i][0] + "\t\t");
            System.out.print(bmiReport[i][1] + "\t\t");
            System.out.print(bmiReport[i][2] + "\t\t");
            System.out.println(bmiReport[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeight = new double[10][2]; // Array to store height and weight

        // Input height and weight for 10 individuals
        System.out.println("Enter height (in cm) and weight (in kg) for 10 individuals:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Height (cm): ");
            heightWeight[i][1] = scanner.nextDouble(); // Store height
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            heightWeight[i][0] = scanner.nextDouble(); // Store weight
        }

        // Calculate BMI and status
        String[][] bmiReport = calculateBMI(heightWeight);

        // Display BMI report
        System.out.println("BMI Report:");
        displayBMIReport(bmiReport);

        scanner.close();
    }
}
