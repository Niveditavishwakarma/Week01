
import java.util.Scanner;

class SimpleInterestCalculator {

    // Method to calculate simple interest
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Create an instance of the scanner class to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input Principal, Rate of Interest, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        SimpleInterestCalculator calculator = new SimpleInterestCalculator();

        // Calculate the simple interest using the method
        double simpleInterest = calculator.calculateSimpleInterest(principal, rate, time);

        // Output: Display the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

        // Close the scanner
        scanner.close();
    }
}

