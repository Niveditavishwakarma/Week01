import java.util.Random;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(100); 
            scores[i][1] = random.nextInt(100); 
            scores[i][2] = random.nextInt(100); 
        }

        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateTotalAndPercentage(int[][] scores) {
        double[][] result = new double[scores.length][4]; 

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off the values to 2 decimal places
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    // Method to calculate the grade based on the percentage
    public static String[][] calculateGrade(double[][] result) {
        String[][] grades = new String[result.length][2];

        for (int i = 0; i < result.length; i++) {
            double percentage = result[i][2];

            // Assign grades based on percentage
            if (percentage >= 80) {
                grades[i][1] = "A";
            } else if (percentage >= 70 && percentage <=79 ) {
                grades[i][1] = "B";
            } else if (percentage >= 60 && percentage <=69) {
                grades[i][1] = "C";
            } else if (percentage >= 50 && percentage <=59) {
                grades[i][1] = "D";
            }else if (percentage >= 40 && percentage <=49) {
                grades[i][1] = "E";	
			}				
			else {
                grades[i][1] = "R";
            }

            grades[i][0] = String.valueOf(i + 1); 
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] result, String[][] grades) {
        System.out.println("Student   Physics   Chemistry       Maths       Total       Average      Percentage       Grade");
        System.out.println("-------------------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.print(grades[i][0] + "\t");
            System.out.print(scores[i][0] + "\t\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t\t");
            System.out.print(result[i][0] + "\t");
            System.out.print(result[i][1] + "\t\t");
            System.out.print(result[i][2] + "%\t\t");
            System.out.println(grades[i][1]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; 

        // Generate random scores for students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage
        double[][] result = calculateTotalAndPercentage(scores);

        // Calculate grade based on percentage
        String[][] grades = calculateGrade(result);

        // Display the final scorecard
        displayScorecard(scores, result, grades);
    }
}
