import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        // Create an array to store the ages of 10 students
        int[] ages = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Take input for the ages of 10 students
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            int age = scanner.nextInt();

            // Check for invalid age
            if (age < 0) {
                System.out.println("Invalid age. Please enter a valid age.");
				// Decrement index to re-enter age for the current student
                i--; 
            } else {
                ages[i] = age;
            }
        }

        // Check voting eligibility for each student
        System.out.println(" Voting Eligibility:");
        for (int age : ages) {
            if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
