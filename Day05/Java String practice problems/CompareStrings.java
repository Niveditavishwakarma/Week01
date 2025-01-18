import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two strings from the user
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Call the function to compare strings lexicographically
        int comparisonResult = compareStringsLexicographically(str1, str2);

        // Display the result based on comparison
        if (comparisonResult < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else if (comparisonResult > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are equal.");
        }

        scanner.close();
    }

    // Function to compare two strings lexicographically
    public static int compareStringsLexicographically(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);

        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 != char2) {
                return char1 - char2; 
            }
        }
        return length1 - length2;
    }
}
