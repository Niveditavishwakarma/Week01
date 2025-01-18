import java.util.Scanner;

public class YoungestAndTallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Take user input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.println("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Variables to store the index of youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find the youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");

        // Close the scanner
        scanner.close();
    }
}
