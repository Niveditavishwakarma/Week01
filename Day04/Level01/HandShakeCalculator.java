
import java.util.Scanner;

class HandshakeCalculator {

    // Method to calculate the maximum number of handshakes
    public int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
		
            HandshakeCalculator calculator = new HandshakeCalculator();

            // Calculate the maximum number of handshakes
            int handshakes = calculator.calculateHandshakes(n);

            // Output: Display the result
            System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
        

        // Close the scanner
        scanner.close();
    }
}

