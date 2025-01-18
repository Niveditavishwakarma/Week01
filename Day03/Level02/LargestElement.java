import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Define variables for storing digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            digits[index++] = digit;
            number /= 10; // Remove the last digit

            // If the array is full, stop storing digits
            if (index == maxDigit) {
                break;
            }
        }

        // Find the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Close the scanner
        scanner.close();
    }
}
