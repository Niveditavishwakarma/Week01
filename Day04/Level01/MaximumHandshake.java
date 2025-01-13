
import java.util.Scanner;

public class MaximumHandshake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
		
            // Using the combination formula
            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Display the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);

        // Close the scanner
        scanner.close();
    }
}

