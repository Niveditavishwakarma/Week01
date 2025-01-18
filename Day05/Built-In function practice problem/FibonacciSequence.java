import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        // Validate input
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("The Fibonacci sequence with " + terms + " terms is:");
            generateFibonacci(terms);
        }

        scanner.close();
    }

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int n) {
        int first = 0, second = 1; 

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); 
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
