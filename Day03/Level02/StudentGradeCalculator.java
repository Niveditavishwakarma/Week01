import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Arrays to store marks for each subject, percentage, and grades
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            // Input and validate Physics marks
            while (true) {
                System.out.print("Physics marks: ");
                physicsMarks[i] = scanner.nextInt();
                if (physicsMarks[i] >= 0) break;
                System.out.println("Marks must be positive. Please re-enter.");
            }

            // Input and validate Chemistry marks
            while (true) {
                System.out.print("Chemistry marks: ");
                chemistryMarks[i] = scanner.nextInt();
                if (chemistryMarks[i] >= 0) break;
                System.out.println("Marks must be positive. Please re-enter.");
            }

            // Input and validate Maths marks
            while (true) {
                System.out.print("Maths marks: ");
                mathsMarks[i] = scanner.nextInt();
                if (mathsMarks[i] >= 0) break;
                System.out.println("Marks must be positive. Please re-enter.");
            }

            // Calculate percentage
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

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
                    physicsMarks[i] + "         " +
                    chemistryMarks[i] + "         " +
                    mathsMarks[i] + "         " +
                    String.format("%.2f", percentages[i]) + "         " +
                    grades[i]);
        }
        // Close the scanner
        scanner.close();
    }
}
