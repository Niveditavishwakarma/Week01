
import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Process each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (isPositive(number)) {
                System.out.print("Number " + number + " is positive and ");
                if (isEven(number)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("Number " + number + " is negative.");
            }
        }

        // Compare the first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("The first number is ");
        if (result == 1) {
            System.out.println("greater than the last number ");
        } else if (result == 0) {
            System.out.println("equal to the last number ");
        } else {
            System.out.println("less than the last number ");
        }

        scanner.close();
    }
}

