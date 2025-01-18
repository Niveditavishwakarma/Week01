import java.util.Scanner;
//create a class to compute whether the number is smallest
class SmallestNumber {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get input values for the three numbers
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = input.nextInt();

        // Check if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Print the result
        System.out.println("Is the first number the smallest? " + isSmallest);

        // Close the Scanner
        input.close();
    }
}
