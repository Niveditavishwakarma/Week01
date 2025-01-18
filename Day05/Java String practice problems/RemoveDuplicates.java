import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the function to remove duplicates
        String result = removeDuplicates(input);

        // Display the modified string without duplicates
        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }

    // Function to remove duplicate characters from the string
    public static String removeDuplicates(String input) {
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (modifiedString.indexOf(String.valueOf(ch)) == -1) {
                modifiedString.append(ch);
            }
        }

        return modifiedString.toString();
    }
}
