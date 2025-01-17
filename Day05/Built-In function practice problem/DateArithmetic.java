import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Input date from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        // Perform date arithmetic
        LocalDate resultDate = date
                .plusDays(7)        
                .plusMonths(1)      
                .plusYears(2)       
                .minusWeeks(3);     

        // Define a formatter for better output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Display the result
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("Final Date after arithmetic: " + resultDate.format(formatter));
    }
}
