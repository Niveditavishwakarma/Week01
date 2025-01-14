import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException 
    public static void generateException(String text) {
        System.out.println("Attempting to generate an IllegalArgumentException...");
        System.out.println("Substring: " + text.substring(5, 3));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            System.out.println("Attempting to handle an invalid substring operation...");
            System.out.println("Substring: " + text.substring(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the method to generate the exception
        System.out.println("Demonstrating IllegalArgumentException:");
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception generated: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

        // Call the method to handle the exception
        System.out.println("Handling IllegalArgumentException:");
        handleException(userInput);

        scanner.close();
    }
}
