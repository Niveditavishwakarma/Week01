import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find the frequency of characters in a string
    public static String[] findFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        // Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') { 
                frequency[i] = 1; 

                // Inner loop to check for duplicate characters
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++; 
                        characters[j] = '0'; 
                    }
                }
            }
        }

        // Create a 1D String array to store the characters and their frequencies
        int resultCount = 0;
        for (int k = 0; k < characters.length; k++) {
            if (characters[k] != '0') {
                resultCount++;
            }
        }

        String[] result = new String[resultCount];
        int index = 0;

        for (int k = 0; k < characters.length; k++) {
            if (characters[k] != '0') {
                result[index] = characters[k] + " : " + frequency[k];
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find character frequencies
        String[] frequencyArray = findFrequency(input);

        // Display the frequencies
        System.out.println("Character Frequencies:");
        for (String entry : frequencyArray) {
            System.out.println(entry);
        }
    }
}
