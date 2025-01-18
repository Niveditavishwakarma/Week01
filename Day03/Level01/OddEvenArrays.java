import java.util.Scanner;

public class OddEvenArrays {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the entered number is a natural number
        if (number <= 0) {
            System.out.println("Error");
            return;
        }

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Initialize index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Iterate from 1 to the number and separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print the odd numbers array
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}
