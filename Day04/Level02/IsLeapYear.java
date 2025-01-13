
import java.util.Scanner;

public class IsLeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is valid (should be >= 1582)
        if (year < 1582) {
            System.out.println("The year must be 1582 or later, as per the Gregorian calendar.");
        } else {
            // Check if the year is a Leap Year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        scanner.close();
    }

    // Method to check if a year is a Leap Year
    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not divisible by 100, unless divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

