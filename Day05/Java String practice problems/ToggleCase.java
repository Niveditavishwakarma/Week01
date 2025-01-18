import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the function to toggle the case of characters
        String toggledString = toggleCase(input);

        // Display the result
        System.out.println("String after toggling case: " + toggledString);

        scanner.close();
    }

    // Function to toggle the case of each character in the string
    public static String toggleCase(String input) {
        StringBuilder toggledString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } 
            else if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } 
            else {
                toggledString.append(ch);
            }
        }

        return toggledString.toString();
    }
}
