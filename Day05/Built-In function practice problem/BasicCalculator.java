import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu of operations
        displayMenu();

        // Get user's choice for the operation
        int choice = getChoice(scanner);

        // Get two numbers from the user for the calculation
        double num1 = getInput(scanner, "Enter the first number: ");
        double num2 = getInput(scanner, "Enter the second number: ");

        // Perform the chosen operation
        switch (choice) {
            case 1:
                double sum = add(num1, num2);
                displayResult(num1, num2, sum, "addition");
                break;
            case 2:
                double difference = subtract(num1, num2);
                displayResult(num1, num2, difference, "subtraction");
                break;
            case 3:
                double product = multiply(num1, num2);
                displayResult(num1, num2, product, "multiplication");
                break;
            case 4:
                if (num2 != 0) {
                    double quotient = divide(num1, num2);
                    displayResult(num1, num2, quotient, "division");
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please choose between 1 and 4.");
        }

        scanner.close();
    }

    // Function to display the menu of operations
    public static void displayMenu() {
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation (1/2/3/4): ");
    }

    // Function to get the user's choice for the operation
    public static int getChoice(Scanner scanner) {
        return scanner.nextInt();
    }

    // Function to get a number input from the user
    public static double getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to perform addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function to perform subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function to perform multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function to perform division
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    // Function to display the result of the operation
    public static void displayResult(double num1, double num2, double result, String operation) {
        System.out.printf("The result of %.2f %s %.2f is: %.2f%n", num1, operation, num2, result);
    }
}
