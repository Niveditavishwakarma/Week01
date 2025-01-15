import java.util.Scanner;

public class CharacterFrequency {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        char[] tempArray = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar is already in tempArray
            for (int j = 0; j < uniqueCount; j++) {
                if (tempArray[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to tempArray
            if (isUnique) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to hold only unique characters
        char[] uniqueChars = new char[uniqueCount];
        System.arraycopy(tempArray, 0, uniqueChars, 0, uniqueCount);

        return uniqueChars;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String text) {
        char[] uniqueChars = uniqueCharacters(text);
        String[][] frequencyTable = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;

            // Calculate frequency of currentChar
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            // Store character and frequency in the table
            frequencyTable[i][0] = Character.toString(currentChar);
            frequencyTable[i][1] = Integer.toString(frequency);
        }

        return frequencyTable;
    }

    // Method to display the frequency table
    public static void displayFrequencyTable(String[][] frequencyTable) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] row : frequencyTable) {
            System.out.println("    " + row[0] + "     |     " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find character frequencies
        String[][] frequencyTable = findFrequency(input);

        // Display the frequency table
        displayFrequencyTable(frequencyTable);
    }
}
