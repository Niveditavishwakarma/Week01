
public class TemperatureUnitConverter {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheittocelsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheittocelsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsiustofahrenheit = (celsius * 9 / 5) + 32;
        return celsiustofahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundstokilograms = 0.453592;
        return pounds * poundstokilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramstopounds = 2.20462;
        return kilograms * kilogramstopounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonstoliters = 3.78541;
        return gallons * gallonstoliters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double literstogallons = 0.264172;
        return liters * literstogallons;
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // User input for conversions
        System.out.println("Enter temperature in Fahrenheit to convert to Celsius:");
        double fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit + "°F = " + convertFahrenheitToCelsius(fahrenheit) + "°C");

        System.out.println("Enter temperature in Celsius to convert to Fahrenheit:");
        double celsius = scanner.nextDouble();
        System.out.println(celsius + "°C = " + convertCelsiusToFahrenheit(celsius) + "°F");

        System.out.println("Enter weight in pounds to convert to kilograms:");
        double pounds = scanner.nextDouble();
        System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kilograms");

        System.out.println("Enter weight in kilograms to convert to pounds:");
        double kilograms = scanner.nextDouble();
        System.out.println(kilograms + " kilograms = " + convertKilogramsToPounds(kilograms) + " pounds");

        System.out.println("Enter volume in gallons to convert to liters:");
        double gallons = scanner.nextDouble();
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");

        System.out.println("Enter volume in liters to convert to gallons:");
        double liters = scanner.nextDouble();
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");

        scanner.close();
    }
}

