import java.util.Scanner;

public class TextSplit2D {

    // Method to find the length of a string without using the built-in length() method
    public static int findLengthWithoutLengthMethod(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitTextWithoutSplitMethod(String text) {
        int length = findLengthWithoutLengthMethod(text);
        int spaceCount = 0;

        // Count the number of spaces to determine the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Create arrays to store space indexes and words
        int[] spaceIndexes = new int[spaceCount + 1];
        String[] words = new String[spaceCount + 1];

        // Store space indexes
        int spaceIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }
        spaceIndexes[spaceCount] = length; 

        // Extract words using space indexes
        int start = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
            start = end + 1;
        }

        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLengthWithoutLengthMethod(words[i]));
        }
        return result;
    }
	
	//create a function to get longest and shortest lengths
	public static String[] findShortestAndLongest(String[][] wordsWithLengths)
	{
		String shortestWord = wordsWithLengths[0][0];
		String longestWord = wordsWithLengths[0][0];
		int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
		int longestLength = Integer.parseInt(wordsWithLengths[0][1]);
		
		for(int i=1; i<wordsWithLengths.length; i++)
		{	
			int currentLength = Integer.parseInt(wordsWithLengths[i][1]);
			if(currentLength < shortestLength)
			{
				shortestLength = currentLength;
				shortestWord = wordsWithLengths[i][0];
			}
			if(currentLength > longestLength)
			{
				longestLength = currentLength;
				longestWord = wordsWithLengths[i][0];
			}
		}
		return new String[]{shortestWord,longestWord};
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        // Split text using the custom method
        String[] customSplit = splitTextWithoutSplitMethod(userInput);

        // Get words with their lengths in a 2D array
        String[][] wordsWithLengths = getWordsWithLengths(customSplit);
		
		//find the longest and shortest words
		String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);
		
        // Display the result in tabular format
        System.out.println("word with shortest length: " + shortestAndLongest[0]);
		System.out.println("word with longest length: " + shortestAndLongest[1]);

        scanner.close();
    }
}
