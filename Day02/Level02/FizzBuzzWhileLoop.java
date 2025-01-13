import java.util.Scanner;

public class FizzBuzzWhileLoop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if number is positive
        if (number > 0) {
            // Loop from 1 to the input number
			int i=0;
            while(i<=number) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
				i++;
            }
        } else {
            System.out.println("enter a positive integer.");
        }
		//close the scanner
		scanner.close();
    }
}