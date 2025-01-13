import java.util.Scanner;

public class MultiDimensionArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for rows and columns
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create a 2D array (Matrix)
        int[][] matrix = new int[rows][cols];

        // Take user input for the 2D array elements
        System.out.println("Enter the elements of the 2D array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] array = new int[rows * cols];
        int index = 0; // Index for the 1D array

        // Copy the elements of the 2D array into the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        for (int element : array) {
            System.out.print(element + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
