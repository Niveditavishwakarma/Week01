import java.util.Scanner;

public class NumberAnalysis {

    public static void main(String[] args) {
        // Define an array to store 5 integers
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Take user input to store numbers in the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array and analyze each number
        for (int number : numbers) {
            if (number > 0) {
                // Check if the number is positive and even/odd
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {
                // Number is negative
                System.out.println(number + " is negative.");
            } else {
                // Number is zero
                System.out.println(number + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("Comparison of the first and last elements:");
        if (first == last) {
            System.out.println("The first and last elements are equal.");
        } else if (first > last) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        // Close the scanner
        scanner.close();
    }
}
