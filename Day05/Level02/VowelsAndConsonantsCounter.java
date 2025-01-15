import java.util.Scanner;

public class VowelsAndConsonantsCounter {

    // Method to check if a character is a vowel or consonant
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch); 
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
		return "Not a letter";
    }

    // Method to find vowels and consonants in a string
    public static int[] findVowelsAndConsonants(String input) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount}; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get counts of vowels and consonants
        int[] counts = findVowelsAndConsonants(input);

        // Display the result
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        scanner.close();
    }
}
