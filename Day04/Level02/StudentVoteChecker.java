
import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Eligible to vote if 18 or older
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the ages of 10 students
        int[] studentAges = new int[10];
        StudentVoteChecker checker = new StudentVoteChecker();

        // Loop to take input for each student's age
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");

        // Loop to check if each student can vote and display the result
        for (int i = 0; i < 10; i++) {
            int age = studentAges[i];
            boolean canVote = checker.canStudentVote(age);
            if (age < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age entered.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + ": Can vote.");
            } else {
                System.out.println("Student " + (i + 1) + ": Cannot vote.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

