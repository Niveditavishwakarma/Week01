import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the total variable to store the sum of numbers
        double total = 0.0;

        // Variable to store the user input
        double number;

        // Ask the user for the first input
        System.out.println("Enter a number (enter 0 to stop): ");
        number = scanner.nextDouble();

        // Use a while loop to keep asking for numbers until the user enters 0
        while (number != 0) {
            // Add the entered number to the total
            total += number;

            // Ask the user to input another number
            System.out.println("Enter another number (enter 0 to stop): ");
            number = scanner.nextDouble();
        }

        // Once 0 is entered, print the total sum
        System.out.println("The total sum of entered numbers is: " + total);

        // Close the scanner
        scanner.close();
    }
}
