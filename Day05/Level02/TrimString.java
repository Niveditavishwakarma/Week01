import java.util.Scanner;

public class TrimString {

    // Method to find start and end points with no spaces
    public static int[] trimSpaces(String input) {
        int start = 0;
        int end = input.length() - 1;

        // Loop to find the first non-space character
        while (start <= end && input.charAt(start) == ' ') {
            start++;
        }

        // Loop to find the last non-space character
        while (end >= start && input.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt() method
    public static String createSubstring(String input, int start, int end) {
        StringBuilder trimmedString = new StringBuilder();

        for (int i = start; i <= end; i++) {
            trimmedString.append(input.charAt(i));
        }

        return trimmedString.toString();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        // Trim spaces using user-defined method
        int[] points = trimSpaces(input);
        String trimmedUsingCustom = createSubstring(input, points[0], points[1]);

        // Trim spaces using built-in method
        String trimmedUsingBuiltIn = input.trim();

        // Compare both strings
        boolean areEqual = compareStrings(trimmedUsingCustom, trimmedUsingBuiltIn);

        // Display results
        System.out.println("Trimmed using custom method: \"" + trimmedUsingCustom + "\"");
        System.out.println("Trimmed using built-in method: \"" + trimmedUsingBuiltIn + "\"");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        scanner.close();
    }
}
