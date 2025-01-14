import java.util.Scanner;

public class ToUpperCase {

    // Method to convert text to uppercase 
    public static String convertToUppercase(String text) {
        StringBuilder uppercaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                uppercaseText.append((char)(ch - 32));
            } else {
                uppercaseText.append(ch);
            }
        }
        return uppercaseText.toString();
    }

    // Method to compare two strings character by character
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

        // Convert to uppercase using the built-in method
        String builtInUppercase = userInput.toUpperCase();

        // Convert to uppercase using the custom method
        String customUppercase = convertToUppercase(userInput);

        // Compare the two results
        boolean isEqual = compareStrings(builtInUppercase, customUppercase);

        // Display the results
        System.out.println("Original Text: " + userInput);
        System.out.println("Built-in Uppercase: " + builtInUppercase);
        System.out.println("Custom Uppercase: " + customUppercase);
        System.out.println("Are both methods producing the same result? " + isEqual);

        scanner.close();
    }
}
