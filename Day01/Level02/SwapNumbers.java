//import Scanner class to take user input
import java.util.Scanner;
//create a class for swapping numbers
class SwapNumbers {
    public static void main(String args[]) {
        //take input from user
        Scanner input = new Scanner(System.in);
        
        //create variables to store two numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
        //swap the values of number1 and number2
        int temp = number1;
        number1 = number2;
        number2 = temp;
        
        //print the swapped result
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
