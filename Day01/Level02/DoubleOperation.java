//import Scanner class to take user input
import java.util.Scanner;
//create a class for double operations
class DoubleOperation {
    public static void main(String args[]) {
        //take input from user
        Scanner input = new Scanner(System.in);
        
        //create variables a, b, and c of double data type
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        
        //compute the double operations
        double result1 = a + b * c;  
        double result2 = a * b + c;  
        double result3 = c + a / b;  
        double result4 = a % b + c;  
        
        //print the result
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
