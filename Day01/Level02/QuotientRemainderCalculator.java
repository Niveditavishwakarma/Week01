//import Scanner class to take user input
import java.util.Scanner;
//create a class for calculating quotient and remainder
class QuotientRemainderCalculator {
    public static void main(String args[]) {
        //take input from user
        Scanner input = new Scanner(System.in);
        
        //create variables to store two numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
        //calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        //print the result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
    }
}
