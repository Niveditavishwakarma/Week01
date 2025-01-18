import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the choice for conversion
        int choice = getChoice(scanner);

        // Perform the conversion based on user choice
        if (choice == 1) {
            double fahrenheit = getInput(scanner, "Enter temperature in Fahrenheit: ");
            double celsius = fahrenheitToCelsius(fahrenheit);
            displayResult(fahrenheit, celsius, "Fahrenheit", "Celsius");
        } else if (choice == 2) {
            double celsius = getInput(scanner, "Enter temperature in Celsius: ");
            double fahrenheit = celsiusToFahrenheit(celsius);
            displayResult(celsius, fahrenheit, "Celsius", "Fahrenheit");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }

    // Function to get the user's choice for conversion
    public static int getChoice(Scanner scanner) {
        System.out.println("Temperature Converter:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    // Function to get the temperature input from the user
    public static double getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to display the result of the conversion
    public static void displayResult(double input, double output, String fromUnit, String toUnit) {
        System.out.printf("%.2f %s is equal to %.2f %s.%n", input, fromUnit, output, toUnit);
    }
}
