
import java.util.Scanner;
public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmtomiles = 0.621371;
        return km * kmtomiles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milestokm = 1.60934;
        return miles * milestokm;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meterstofeet = 3.28084;
        return meters * meterstofeet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feettometers = 0.3048;
        return feet * feettometers;
    }

    // Main method to test the conversion methods
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter km:");
        double km = sc.nextDouble();
		System.out.println("Enter miles:");
        double miles = sc.nextDouble();
		System.out.println("Enter meters:");
        double meters = sc.nextDouble();
		System.out.println("Enter feet:");
        double feet = sc.nextDouble();

        // Test conversion of kilometers to miles
        System.out.println(km + " kilometers = " + convertKmToMiles(km) + " miles");

        // Test conversion of miles to kilometers
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " kilometers");

        // Test conversion of meters to feet
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");

        // Test conversion of feet to meters
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}

