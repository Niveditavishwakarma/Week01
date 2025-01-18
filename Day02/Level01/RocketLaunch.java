import java.util.Scanner;
class RocketLaunch {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the starting number for the countdown
        System.out.print("Enter the starting countdown number: ");
        int counter = scanner.nextInt();

        // Use a while loop to count down
        while (counter >= 1) {
            // Print the current countdown value
            System.out.println(counter);

            // Decrement the counter
            counter--;
        }

        // Close the scanner object
        scanner.close();
    }
}
