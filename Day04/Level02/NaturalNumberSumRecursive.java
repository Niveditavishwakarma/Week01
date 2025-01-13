
import java.util.Scanner;

public class NaturalNumberSumRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();

        // Check if the input is a natural number 
        if (n <= 0) {
            System.out.println("Input is not a natural number. Exiting...");
            return; 
        }

        // Find the sum using recursion
        int sumRecursive = sumRecursive(n);

        // Find the sum using the formula
        int sumFormula = sumFormula(n);

        // Compare the results
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using the formula n*(n+1)/2: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both results are correct and match!");
        } else {
            System.out.println("Results do not match.");
        }

        scanner.close();
    }

    // Method to find sum of first n natural numbers using recursion
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;  
        }
        return n + sumRecursive(n - 1);  
    }

    // Method to find sum of first n natural numbers using the formula
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;  
    }
}

