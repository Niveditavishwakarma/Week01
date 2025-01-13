//import Scanner class to take user input
import java.util.Scanner;
//create a class for performing basic arithmetic operations
class BasicCalculator {
    public static void main(String args[]) {
        //take input from user
        Scanner input = new Scanner(System.in);
        //create variables to store two numbers
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();
        //perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        //print the results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}