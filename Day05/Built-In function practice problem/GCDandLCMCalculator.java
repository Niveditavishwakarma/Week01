import java.util.Scanner;

public class GCDandLCMCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        int num1 = getInput(scanner, "Enter the first number: ");
        int num2 = getInput(scanner, "Enter the second number: ");

        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        // Display the results
        displayResults(gcd, lcm);

        scanner.close();
    }

    // Function to get the user input
    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt(); 
    }
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; 
    }

    // Function to calculate the Least Common Multiple (LCM)
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Function to display the GCD and LCM
    public static void displayResults(int gcd, int lcm) {
        System.out.println("Greatest Common Divisor (GCD) is: " + gcd);
        System.out.println("Least Common Multiple (LCM) is: " + lcm);
    }
}
