
import java.util.Random;

public class StudentScore {

    // Method to generate random scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); 
            scores[i][1] = 50 + random.nextInt(51); 
            scores[i][2] = 50 + random.nextInt(51);
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Store rounded total, average, and percentage
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                (int) results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2]
            );
        }
    }

    public static void main(String[] args) {
        // Input: Number of students
        int numStudents = 5; // You can take input from the user if needed

        //Generate scores
        int[][] scores = generateScores(numStudents);

        //Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        //Display the scorecard
        displayScoreCard(scores, results);
    }
}

