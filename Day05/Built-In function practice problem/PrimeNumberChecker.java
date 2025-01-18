import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to check
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Check if the number is prime and display the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }

        return true; 
    }
}
