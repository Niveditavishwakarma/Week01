import java.util.HashMap;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "success"; 
        char result = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + result + "'");
    }

    public static char findMostFrequentCharacter(String input) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Counting the frequency of each character
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Finding the character with the highest frequency
        char mostFrequentChar = input.charAt(0);
        int maxCount = 0;

        for (char c : frequencyMap.keySet()) {
            if (frequencyMap.get(c) > maxCount) {
                mostFrequentChar = c;
                maxCount = frequencyMap.get(c);
            }
        }

        return mostFrequentChar;
    }
}
