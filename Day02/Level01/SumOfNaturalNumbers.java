import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a number
        System.out.println("Enter a natural number: ");
        int n = sc.nextInt();
            int formula= n * (n + 1) / 2;

            // Compute the sum using a while loop
            int loopSum = 0;
            int counter = 1;
            while (counter <= n) {
                loopSum += counter;
                counter++;
            }

            // Compare the results and display the output
            System.out.println("Sum is: " + formula);
            System.out.println("Sum using the while loop is: " + loopSum);

            // Check if both sums are the same
            if (formula == loopSum) {
                System.out.println("Both results are correct and match!");
            } else {
                System.out.println("both are different");
            }
			 // Close the scanner object
			sc.close();
    
        }
    }

