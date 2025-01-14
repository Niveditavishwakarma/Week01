import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        System.out.println("Attempting to generate a NumberFormatException");
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException 
    public static void handleException(String text) {
        try {
            System.out.println("Attempting to handle invalid number parsing");
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to parse as a number: ");
        String userInput = scanner.nextLine();

        // Call the method to generate the exception
        System.out.println("Demonstrating NumberFormatException:");
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception generated: " + e.getMessage());
        }

        // Call the method to handle the exception
        System.out.println("Handling NumberFormatException:");
        handleException(userInput);

        scanner.close();
    }
}
