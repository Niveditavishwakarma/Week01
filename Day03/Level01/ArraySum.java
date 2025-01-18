import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Define an array of 10 elements of type double
        double[] numbers = new double[10];
        double total = 0.0; 
        int index = 0; 

        // Use an infinite while loop to take user input
        while (true) {
            // ask the user for input
            System.out.print("Enter a number: ");
            double input = scanner.nextDouble();

            // Check if the input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Break if the array is full
            if (index == 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            // Store the input in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Calculate the sum of the entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the total
        System.out.println("Sum of all numbers: " + total);

        // Close the scanner
        scanner.close();
    }
}
