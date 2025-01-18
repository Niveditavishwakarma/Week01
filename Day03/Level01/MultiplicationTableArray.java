import java.util.Scanner;

public class MultiplicationTableArray {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        //ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store the multiplication results
        int[] multiplicationResult = new int[4];

        // Use a for loop to calculate the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; // Store the result in the array
        }

        // Display the results
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
