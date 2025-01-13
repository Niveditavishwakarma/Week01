import java.util.Scanner;

public class FactorialProgram {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to input an integer
        System.out.println("Enter a positive integer: ");
        int number = sc.nextInt();

            long factorial = 1;

            // Compute the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is " + factorial);
        

        // Close the scanner object
        sc.close();
    }
}
