import java.util.Scanner;

public class SalaryBonus {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        //to input the salary and years of service
        System.out.print("Enter the salary of the employee: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the years of service: ");
        int yearsOfService = sc.nextInt();

        // Define the bonus percentage and calculate the bonus if applicable
        double bonus = 0;

        // If the years of service are greater than 5, the bonus is 5%
        if (yearsOfService > 5) {
            bonus = salary * 0.05;  
            System.out.println("The employee's bonus is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        // Close the scanner object
        sc.close();
    }
}
