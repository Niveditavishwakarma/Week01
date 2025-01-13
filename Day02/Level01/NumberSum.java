import java.util.Scanner;

public class NumberSum {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Initialize the total variable to store the sum of numbers
        double total = 0.0;

        // Infinite while loop
        while (true) {
            // Ask the user for input
            System.out.println("Enter a number (enter 0 or a negative number to stop): ");
            double number = sc.nextDouble();

            // Check if the entered number is 0 or negative to break the loop
            if (number <= 0) {
                break;
            }

            // Add the entered number to the total
            total += number;
        }

        // Once 0 or a negative number is entered, print the total sum
        System.out.println("The total sum of entered numbers is: " + total);

        // Close the scanner
        sc.close();
    }
}
