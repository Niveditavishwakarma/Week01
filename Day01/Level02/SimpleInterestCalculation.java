//import Scanner class to take user input
import java.util.Scanner;
//create a class to compute Simple Interest
class SimpleInterestCalculator {

    public static void main(String[] args) {

        // Create a Scanner object to take user inputs
        Scanner input = new Scanner(System.in);

        // Take input for Principal amount
        System.out.print("Enter the Principal: ");
        double principal = input.nextDouble();

        // Take input for Rate of Interest
        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();

        // Take input for Time (in years)
        System.out.print("Enter the Time period: ");
        int time = input.nextInt();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + 
                           principal + ", Rate of Interest " + rate + ", and Time " + time);
    }
}

