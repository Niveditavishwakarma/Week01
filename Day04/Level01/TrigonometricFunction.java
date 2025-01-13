import java.util.Scanner;

public class TrigonometricFunction {

    // Method to calculate various trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle in degrees to radians
        double angleInRadian = Math.toRadians(angle);

        // Math class functions
        double sine = Math.sin(angleInRadian);
        double cosine = Math.cos(angleInRadian);
        double tangent = Math.tan(angleInRadian);

        // Returning result in an array
        return new double[]{sine, cosine, tangent};
    }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get angle input from the user
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Calculate the various trigonometric functions
        double[] result = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("The sine value is: " + result[0]);
        System.out.println("The cosine value is: " + result[1]);
        System.out.println("The tangent value is: " + result[2]);

        scanner.close();
    }
}

