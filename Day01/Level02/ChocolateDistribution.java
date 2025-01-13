//import Scanner class to take user input
import java.util.Scanner;
//create a class to compute the distribution of chocolates
class ChocolateDistribution {

    public static void main(String[] args) {

        // Create a Scanner object to take user inputs
        Scanner input = new Scanner(System.in);

        // Take input for the number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        // Take input for the number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate the number of chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate the number of remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Print the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                           " and the number of remaining chocolates are " + remainingChocolates);
    }
}
