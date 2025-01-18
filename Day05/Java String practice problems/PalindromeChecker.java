import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the function to check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String input) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        input = input.replaceAll("\\s", "").toLowerCase();

        int length = input.length();

        // Loop through the string, comparing characters from both ends
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false; // If characters don't match, it's not a palindrome
            }
        }

        return true; // The string is a palindrome
    }
}
