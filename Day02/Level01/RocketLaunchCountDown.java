import java.util.Scanner;
class RocketLaunchCountDown{

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the starting number for the countdown
        System.out.print("Enter the starting countdown number: ");
        int counter = scanner.nextInt();

        // Use a for loop to count down
        for (int i = counter; i >= 1; i--) {
            // Print the current countdown value
            System.out.println(i);
        }

        // Close the scanner object
        scanner.close();
    }
}
