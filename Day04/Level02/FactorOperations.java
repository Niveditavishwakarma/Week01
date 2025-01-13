
import java.util.Scanner;

public class FactorOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find factors and store them in an array
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate and display sum of factors
        int sumOfFactors = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sumOfFactors);

        // Calculate and display product of factors
        long productOfFactors = productOfFactors(factors);
        System.out.println("Product of factors: " + productOfFactors);

        // Calculate and display sum of squares of factors
        long sumOfSquaresOfFactors = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors);

        scanner.close();
    }

    // Method to find factors and store them in an array
    public static int[] findFactors(int number) {
        // Count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array to store factors
        int[] factors = new int[count];
        int index = 0;

        // Store factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static long sumOfSquaresOfFactors(int[] factors) {
        long sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }
}

