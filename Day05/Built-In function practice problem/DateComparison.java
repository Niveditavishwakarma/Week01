import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // ask user to enter the first date
            System.out.print("Enter the first date (yyyy-MM-dd): ");
            String firstDateInput = scanner.nextLine();
            LocalDate firstDate = LocalDate.parse(firstDateInput, dateFormatter);

            // ask user to enter the second date
            System.out.print("Enter the second date (yyyy-MM-dd): ");
            String secondDateInput = scanner.nextLine();
            LocalDate secondDate = LocalDate.parse(secondDateInput, dateFormatter);

            // Compare the two dates
            if (firstDate.isBefore(secondDate)) {
                System.out.println("The first date is before the second date.");
            } else if (firstDate.isAfter(secondDate)) {
                System.out.println("The first date is after the second date.");
            } else if (firstDate.isEqual(secondDate)) {
                System.out.println("The first date is the same as the second date.");
            }
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
        } finally {
            scanner.close();
        }
    }
}
