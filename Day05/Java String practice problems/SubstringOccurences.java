import java.util.Scanner;

public class SubstringOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the main string and substring input from the user
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring: ");
        String substring = scanner.nextLine();

        // Call the function to count the occurrences of the substring
        int count = countSubstringOccurrences(mainString, substring);

        // Display the result
        System.out.println("The substring occurs " + count + " times in the main string.");

        scanner.close();
    }

    // Function to count the occurrences of a substring in the main string
    public static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;

        while((index = mainString.indexOf(substring, index)) != -1) {
            count++; 
            index++; 
        }

        return count;
    }
}
