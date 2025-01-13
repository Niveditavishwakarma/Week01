//import Scanner class to take user input
import java.util.Scanner;
//create a class for integer operations
class IntOperation {
    public static void main(String args[]) {
        //take input from user
        Scanner input = new Scanner(System.in);
        
        //create variables a, b, and c
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        
        System.out.print("Enter the value of c: ");
        int c = input.nextInt();
        
        //compute the integer operations
        int result1 = a + b * c;  
        int result2 = a * b + c; 
        int result3 = c + a / b;  
        int result4 = a % b + c; 
        
        //print the result
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
