import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Create an array to store the results
        String[] results = new String[number];

        // Loop through and determine the result for each index
        for (int i = 0; i < number; i++) {
            int currentNumber = i + 1;
            
            if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (currentNumber % 3 == 0) {
                results[i] = "Fizz";
            } else if (currentNumber % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(currentNumber);
            }
        }

        // Loop to display the results
        for (int i = 0; i < number; i++) {
            System.out.println(results[i] +" ");
        }

        scanner.close();
    }
}
