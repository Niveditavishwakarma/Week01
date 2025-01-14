import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Attempting to generate an ArrayIndexOutOfBoundsException:");
        System.out.println("Accessing out-of-bounds index: " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch block
    public static void handleException(String[] names) {
        try {
            System.out.println("Attempting to access an out-of-bounds index...");
            System.out.println("Accessing out-of-bounds index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[size];
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.nextLine();
        }

        // Call the method to generate the exception
        System.out.println("Demonstrating ArrayIndexOutOfBoundsException:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception generated: " + e.getMessage());
        }

        // Call the method to handle the exception
        System.out.println("Handling ArrayIndexOutOfBoundsException:");
        handleException(names);

        scanner.close();
    }
}
