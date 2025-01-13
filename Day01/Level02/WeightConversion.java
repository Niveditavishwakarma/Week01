//import Scanner class to take user input
import java.util.Scanner;
//create a class to convert weight from pounds to kilograms
class WeightConversion{

    public static void main(String[] args) {

        // Create a Scanner object to take user inputs
        Scanner input = new Scanner(System.in);

        // Take input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Convert weight to kilograms
        double weightInKilograms = weightInPounds * 2.2;

        // Print the result
        System.out.println("The weight of the person in pounds is " + weightInPounds +
                           " and in kg is " + weightInKilograms);
    }
}
