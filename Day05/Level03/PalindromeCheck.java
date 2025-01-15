import java.util.Scanner;

public class PalindromeCheck {

    // Compare characters from start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    //  Reverse a string and compare
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindromeUsingReverse(String text) {
        String reversed = reverseString(text);
        return text.equals(reversed);
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input text from user
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Check palindrome using three methods
        boolean resultIterative = isPalindromeIterative(text);
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean resultReverse = isPalindromeUsingReverse(text);

        // Display results
        System.out.println("Palindrome Check Results:");
        System.out.println("Logic 1 (Iterative): " + (resultIterative ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 2 (Recursive): " + (resultRecursive ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 3 (Using Reverse): " + (resultReverse ? "Palindrome" : "Not a Palindrome"));
    }
}
