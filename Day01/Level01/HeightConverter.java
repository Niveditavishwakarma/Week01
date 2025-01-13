//import Scanner class to take user input
import java.util.Scanner;
//create a class for converting height from centimeters to feet and inches
class HeightConverter {
    public static void main(String args[]) {
        //take input from user 
        Scanner input = new Scanner(System.in);
        //create a variable to store height in cm
        System.out.print("Enter your height in cm: ");
        double heightInCm = input.nextDouble();
        //convert height to inches
        double heightInInches = heightInCm / 2.54;
        //convert height to feet
        double heightInFeet = heightInInches / 12;
        //print the results
        System.out.println("Your height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
    }
}