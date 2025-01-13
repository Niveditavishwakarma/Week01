import java.util.Scanner;

public class FactorsArray {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Initialize the factors array 
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Add the factor to the array
                factors[index++] = i;

                // Check if the array needs to be expanded
                if (index == maxFactor) {
                    // Double the array size
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
            }
        }

        // Display the factors of the number
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}
