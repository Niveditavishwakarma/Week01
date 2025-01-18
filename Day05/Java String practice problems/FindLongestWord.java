import java.util.Scanner;

public class FindLongestWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the sentence input from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Call the function to find the longest word
        String longestWord = findLongestWord(sentence);

        // Display the longest word
        System.out.println("The longest word is: " + longestWord);

        scanner.close();
    }

    // Function to find the longest word in the sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");

        // Initialize a variable to store the longest word
        String longestWord = "";
		
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
