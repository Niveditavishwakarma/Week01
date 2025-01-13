
import java.util.Scanner;

public class AtheletRun {

    // Method to calculate the number of rounds needed
    public double calculateRounds(double side1, double side2, double side3, double distanceToRun) {
        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Calculate the number of rounds required to cover the specified distance
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangle
        System.out.print("Enter the first side of the triangle(in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle(in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle(in meters): ");
        double side3 = scanner.nextDouble();

        // The distance to be run (in kilometers, converted to meters)
        double distanceToRun = 5000; // 5 km = 5000 meters

		AtheletRun run = new AtheletRun();

        // Calculate the number of rounds
        double rounds = run.calculateRounds(side1, side2, side3, distanceToRun);

        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 kilometers.");

        // Close the scanner
        scanner.close();
    }
}

