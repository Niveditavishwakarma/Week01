import java.util.Scanner;

public class MeanHeightCalculator {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Create a double array of size 11 to store the heights
        double[] heights = new double[11];

        // Initialize a variable to store the sum of heights
        double sum = 0.0;

        // Get the height of each player from the user
        System.out.println("Enter the heights: ");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; // Add the height to the sum
        }

        // Calculate the mean height
        double mean = sum / heights.length;

        // Print the mean height
        System.out.printf("The mean height of the football team is: %.2f%n", mean);

        // Close the scanner
        scanner.close();
    }
}
