import java.util.Scanner;

public class MultiplicationTable{

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Get the number for the multiplication table
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store the results of the multiplication table
        int[] table = new int[10];

        // Calculate the multiplication table and store results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i+1) + " = " + table[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
