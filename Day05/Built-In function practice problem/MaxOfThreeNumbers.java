import java.util.Scanner;

public class MaxOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take three integer inputs from the user
        int num1 = getInput(scanner, "Enter the first number: ");
        int num2 = getInput(scanner, "Enter the second number: ");
        int num3 = getInput(scanner, "Enter the third number: ");

        // Calculate and display the maximum number
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);

        scanner.close();
    }

    // Function to take an integer input from the user
    public static int getInput(Scanner scanner, String prompt) {
        int number = 0; 
    boolean isValid = false; 

    while (!isValid) {
        System.out.print(prompt);
        String input = scanner.nextLine(); 
        try {
            number = Integer.parseInt(input); 
            isValid = true; 
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
    return number;
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c)); 
    }
}
