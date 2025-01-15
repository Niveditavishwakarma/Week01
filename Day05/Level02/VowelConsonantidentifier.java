import java.util.Scanner;

public class VowelConsonantIdentifier {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch); 
        if (ch >= 'a' && ch <= 'z') { 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static String[][] findCharacterTypes(String input) {
        String[][] result = new String[input.length()][2]; 

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch); 
            result[i][1] = checkCharacter(ch);
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("-------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the 2D array of characters and their types
        String[][] characterTypes = findCharacterTypes(input);

        // Display the result in a tabular format
        displayTable(characterTypes);

        scanner.close();
    }
}
