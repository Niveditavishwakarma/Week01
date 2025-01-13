import java.util.Scanner;

public class WindChill {

    // Method to calculate the wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get temperature input from the user
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        // Get wind speed input from the user
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

            // Calculate the wind chill
            double windChill = calculateWindChill(temperature, windSpeed);

            // Display the result
			System.out.println("The windChill is :"+ windChill);
			scanner.close();
        }

        
    }

