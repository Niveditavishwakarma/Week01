import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to input an integer
        System.out.println("Enter a positive integer: ");
        int number = sc.nextInt();

            // Variable to store the factorial result
            long factorial = 1;

            // Calculate the factorial using a while loop
            int counter = 1;
            while (counter <= number) {
                factorial *= counter;
                counter++;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        // Close the scanner object
        sc.close();
    }
}
