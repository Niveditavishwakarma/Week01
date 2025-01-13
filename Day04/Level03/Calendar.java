import java.util.Scanner;

public class Calendar {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get the number of days in the month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check for February (Leap year check)
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return daysInMonth[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        if (month <= 2) {
            month += 12;
            year -= 1;
        }
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the header (Month and Year)
        System.out.println("    " + monthName + " " + year);
        System.out.println("Sun  Mon  Tue  Wed   Thu  Fri  Sat");

        // Print the indentation for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  // Each day is 4 characters wide for consistent spacing
        }

        // Display the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            // Print each day with 3 spaces for alignment
            System.out.print(" " + day + "  ");

            // Adjusting for single-digit days
            if (day < 10) {
                System.out.print(" ");
            }

            // Move to the next line after Saturday (i.e., after 7th day of the week)
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        // Move to the next line if the last day isn't Saturday
        if ((daysInMonth + firstDay) % 7 != 0) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Input from user for month and year
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar
        displayCalendar(month, year);
    }
}
