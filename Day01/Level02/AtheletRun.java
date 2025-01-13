//import Scanner class to take user input
import java.util.Scanner;
//create a class for calculating the number of rounds
class AthleteRun {

    public static void main(String[] args) {
        
        // Create a Scanner object to take user inputs
        Scanner input = new Scanner(System.in);

        // Take user input for the three sides of the triangular park
        System.out.print("Enter the length of side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // The total distance the athlete needs to run 
        double totalDistance = 5000;

        // Calculate the number of rounds the athlete must complete
        double rounds = totalDistance / perimeter;

        // Print the result
        System.out.println("The total number of rounds the athlete will run to complete 5 km is: " + rounds);
    }
}
