import java.util.Scanner;

public class NaturalNumSum {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        //  to input a number
        System.out.println("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int formula = n * (n + 1) / 2;

            // Compute the sum using a for loop
            int loopSum = 0;
            for (int i= 1; i <= n; i++) {
                loopSum += i;
            }

            // Compare the results 
            System.out.println("Sum is: " + formula);
            System.out.println("Sum using the for loop: " + loopSum);

            // Check if both sums are the same
            if (formula == loopSum) {
                System.out.println("Both results are correct and match!");
            } else {
                System.out.println("Both are different");
            }
        }

        // Close the scanner object
        scanner.close();
    }
}
