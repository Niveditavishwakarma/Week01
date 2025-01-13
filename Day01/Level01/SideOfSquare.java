//import Scanner class to take user input
import java.util.Scanner;
//create a class for finding the side of a square from its perimeter
class SquareSide {
    public static void main(String args[]) {
        //take input from user
        Scanner input = new Scanner(System.in);
        //create a variable to store the perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        //calculate the side of the square
        double side = perimeter / 4;
        //print the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
