import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        System.out.println("Provide feedback: 'H' for high, 'L' for low, or 'C' for correct.");

        int low = 1, high = 100;
        boolean isCorrect = false;

        while (!isCorrect) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            char feedback = getUserFeedback(scanner);

            switch (feedback) {
                case 'H':
                    high = guess - 1; 
                    break;
                case 'L':
                    low = guess + 1; 
                    break;
                case 'C':
                    isCorrect = true;
                    System.out.println("Yay! I guessed your number correctly: " + guess);
                    break;
                default:
                    System.out.println("Invalid input. Please provide 'H', 'L', or 'C'.");
            }

            if (low > high) {
                System.out.println("Hmm, something went wrong. Did you change your number?");
                break;
            }
        }
        scanner.close();
    }

    // Function to generate a random guess within the given range
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low; 
    }

    public static char getUserFeedback(Scanner scanner) {
        System.out.print("Enter your feedback (H/L/C): ");
        return scanner.nextLine().toUpperCase().charAt(0);
    }
}
