import java.util.Scanner;

public class ToLowerCase {

    // Method to convert text to lowercase 
    public static String convertToLowercase(String text) {
        StringBuilder lowercaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowercaseText.append((char)(ch + 32));
            } else {
                lowercaseText.append(ch);
            }
        }
        return lowercaseText.toString();
    }

    // Method to compare two strings 
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
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Convert to lowercase using the built-in method
        String builtInLowercase = userInput.toLowerCase();

        // Convert to lowercase using the custom method
        String customLowercase = convertToLowercase(userInput);

        // Compare the two results
        boolean isEqual = compareStrings(builtInLowercase, customLowercase);

        // Display the results
        System.out.println("Original Text: " + userInput);
        System.out.println("Built-in Lowercase: " + builtInLowercase);
        System.out.println("Custom Lowercase: " + customLowercase);
        System.out.println("Are both methods producing the same result? " + isEqual);

        scanner.close();
    }
}
