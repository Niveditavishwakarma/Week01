import java.util.Scanner;
//create a class to find the number is positive , negative or zero
class NumberSign {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Get input value for the number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            // If the number is greater than 0, it is positive
            System.out.println("The number is positive.");
        } else if (number < 0) {
            // If the number is less than 0, it is negative
            System.out.println("The number is negative.");
        } else {
            // If the number is equal to 0
            System.out.println("The number is zero.");
        }

        // Close the scanner
        input.close();
    }
}
