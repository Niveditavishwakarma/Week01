import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Boolean variable to store whether the number is prime
        boolean isPrime = true;
        
        // Check if the number is less than or equal to 1
        if (number <= 1) {
            isPrime = false;  
        } else {
            for (int i = 2; i < number; i++) {
                // Check if the number is divisible by any number between 2 and number-1
                if (number % i == 0) {
                    isPrime = false;  
                    break;  
                }
            }
        }
        
        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
		scanner.close();
    }
}