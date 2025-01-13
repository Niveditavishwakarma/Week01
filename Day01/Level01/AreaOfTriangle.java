//import Scanner class to take user input
import java.util.Scanner;
//create a class for calculating the area of a triangle
class AreaOfTriangle {
    public static void main(String args[]) {
        //take input from user 
        Scanner input = new Scanner(System.in);
        //create variables to store base and height in inches
        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInInches = input.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInInches = input.nextDouble();
        
        //convert base and height to centimeters
        double baseInCm = baseInInches * 2.54;
        double heightInCm = heightInInches * 2.54;

        //convert base and height to feet
        double baseInFeet = baseInInches / 12;
        double heightInFeet = heightInInches / 12;

        //calculate the area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        //calculate the area in square centimeters
        double areaInSquareCentimeters = 0.5 * baseInCm * heightInCm;

        //calculate the area in square feet
        double areaInSquareFeet = 0.5 * baseInFeet * heightInFeet;

        //print the results
        System.out.println( "Your area in cm is " + areaInSquareCentimeters + " while in feet is " + areaInSquareFeet + " and inches is " + areaInSquareInches);

    }
}
