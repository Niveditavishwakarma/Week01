import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Initialize arrays for marks, percentages, and grades
        int[][] marks = new int[numberOfStudents][3]; // [physics, chemistry, maths]
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                // Validate positive marks input
                do {
                    System.out.print(subject + " marks: ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Marks must be positive. Please re-enter.");
                    }
                } while (marks[i][j] < 0);
            }

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70&& percentages[i]<=79) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60 && percentages[i]<= 69) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50 && percentages[i]<= 59) {
                grades[i] = 'D';
			}
			else if (percentages[i] >= 40 && percentages[i]<= 49) {
                grades[i] = 'E';
				
            } else {
                grades[i] = 'R';
            }
        }

        // Display the marks, percentages, and grades
        System.out.println("Student   Physics    Chemistry  Maths      Percentage      Grade");

        // Printing data for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) + "         " +
                    marks[i][0] + "         " +
                    marks[i][1] + "         " +
                    marks[i][2] + "         " +
                    String.format("%.2f", percentages[i]) + "         " +
                    grades[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
