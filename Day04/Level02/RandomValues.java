import java.util.Arrays;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a 4-digit random number (between 1000 and 9999)
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000);
        }
        return randomNumbers;
    }

    // Method to find the average, min, and max values of an array
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomValues randomValues = new RandomValues();
        
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = randomValues.generate4DigitRandomArray(5);
        
        // Print the generated random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        
        // Find the average, min, and max values of the array
        double[] result = randomValues.findAverageMinMax(randomNumbers);
        
        // Print the results
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}

