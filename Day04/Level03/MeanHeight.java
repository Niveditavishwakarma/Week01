
import java.util.Scanner;

public class MeanHeight {

    // Method to calculate the sum of heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean of heights
    public static int calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return sum / heights.length;
    }

    // Method to find the shortest player
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest player
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store the heights of 11 players
        int[] heights = new int[11];

        // Generate random heights between 150 and 250 cm for 11 players
        System.out.println("Generating random heights for 11 players...");
        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // Range: 150 to 250
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }

        // Calculate and display results
        int totalSum = calculateSum(heights);
        int mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\nResults:");
        System.out.println("Total sum of heights: " + totalSum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");

        input.close();
    }
}

