import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        String input = getInput(scanner, "Enter a string to check if it's a palindrome: ");

        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            displayResult(input, true);
        } else {
            displayResult(input, false);
        }

        scanner.close();
    }

    // Function to get the user input
    public static String getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine(); 
    }

    // Function to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; 
            }
            start++;
            end--;
        }

        return true; 
	}


    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
