import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input number from the user
        int number = getInput(scanner, "Enter a number to calculate its factorial: ");

        long factorial = calculateFactorial(number);

        // Display the result
        displayResult(number, factorial);

        scanner.close();
    }

    // Function to get the user input
    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt(); 
    }

    // Recursive function to calculate the factorial of a number
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    // Function to display the result
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
