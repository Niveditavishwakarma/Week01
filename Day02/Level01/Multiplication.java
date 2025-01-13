import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Use a for loop to print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner object
        sc.close();
    }
}
