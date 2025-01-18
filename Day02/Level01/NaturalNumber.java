import java.util.Scanner;
//create a class to calculate sum of Natural number
class NaturalNumber {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get input value for the number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number >= 1) {
            // Sum of n natural numbers formula: n * (n + 1) / 2
            int sum = number * (number + 1) / 2;

            // Print the sum of natural numbers
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the Scanner
        input.close();
    }
}
