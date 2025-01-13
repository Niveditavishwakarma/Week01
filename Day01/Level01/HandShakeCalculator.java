//import Scanner class to take user input
import java.util.Scanner;
//create a class for calculating the maximum number of handshakes
class HandshakeCalculator {
    public static void main(String args[]) {
        //take input from user
        Scanner input = new Scanner(System.in);
        
        //create a variable to store the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        //calculate the maximum number of handshakes using combination formula (n * (n - 1)) / 2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        //print the result
        System.out.println("The maximum number of handshakes among students is " + maxHandshakes);
    }
}
