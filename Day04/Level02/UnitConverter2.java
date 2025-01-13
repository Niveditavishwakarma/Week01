
import java.util.Scanner;

public class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardstofeet = 3;
        return yards * yardstofeet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feettoyards = 0.333333;
        return feet * feettoyards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meterstoinches = 39.3701;
        return meters * meterstoinches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchestometers = 0.0254;
        return inches * inchestometers;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchestocm = 2.54;
        return inches * inchestocm;
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user which conversion to perform
        System.out.println("Enter the number of yards to convert to feet:");
        double yards = scanner.nextDouble();
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        System.out.println("Enter the number of feet to convert to yards:");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        System.out.println("Enter the number of meters to convert to inches:");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");

        System.out.println("Enter the number of inches to convert to meters:");
        double inches = scanner.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");

        System.out.println("Enter the number of inches to convert to centimeters:");
        double inchesForCm = scanner.nextDouble();
        System.out.println(inchesForCm + " inches = " + convertInchesToCentimeters(inchesForCm) + " centimeters");

        scanner.close();
    }
}

