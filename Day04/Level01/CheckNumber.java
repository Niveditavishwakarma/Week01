import java.util.Scanner;

public class CheckNumber {

    // Method to determine if a number is positive, negative, or zero
    public int checkNumber(int number) {
        if (number > 0) {
            return 1; 
        } else if (number < 0) {
            return -1; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        CheckNumber checker = new CheckNumber();

        // method call
        int result = checker.checkNumber(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
