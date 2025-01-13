//import Scanner class to take user input
import java.util.Scanner;
//create a class for converting distance from feet to yards and miles
class DistanceConverter {
    public static void main(String args[]) {
        //take input from user
        Scanner input = new Scanner(System.in);
        //create a variable to store distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        //convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;
        
        //convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;
        
        //print the results
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
    }
}