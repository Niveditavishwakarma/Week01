import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; 

        // Loop to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store the characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i); 
                result[index][1] = Integer.toString(frequency[i]);
                index++;
            }
        }

        return result;
    }

    // Method to display the frequency table
    public static void displayFrequencyTable(String[][] frequencyTable) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] row : frequencyTable) {
            System.out.println("    " + row[0] + "     |     " + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find character frequencies
        String[][] frequencyTable = findCharacterFrequency(input);

        // Display the frequency table
        displayFrequencyTable(frequencyTable);
    }
}
