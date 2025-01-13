//import Scanner class to take user input
import java.util.Scanner;
//create a class for calculating travel details
class TravelComputation {

    public static void main(String[] args) {
        
        // Create a Scanner object to take user inputs
        Scanner input = new Scanner(System.in);

        // Take user input for the traveler's name
        System.out.print("Enter the traveler's name: ");
        String name = input.nextLine();

        // Take user input for cities: fromCity, viaCity, toCity
        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        // Take user input for distances in miles
        System.out.print("Enter the distance from fromCity to viaCity in miles: ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter the distance from viaCity to toCity in miles: ");
        double distanceViaToFinalCity = input.nextDouble();

        // Take user input for time taken in minutes
        System.out.print("Enter the time taken to travel from fromcity to viaCity in minutes: ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter the time taken to travel from viaCity to toCity in minutes: ");
        int timeViaToFinalCity = input.nextInt();

        // Calculate the total distance in miles
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Calculate the total time in minutes
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the result
        System.out.println("The Total Distance travelled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " miles and " +
                           "the Total Time taken is " + totalTime + " minutes ");
    }
}
